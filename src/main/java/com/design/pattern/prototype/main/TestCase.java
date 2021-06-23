package com.design.pattern.prototype.main;

import com.alibaba.fastjson.JSON;
import com.design.pattern.factory.pojo.mobile.MobileProduct;
import com.design.pattern.factory.simple.ProductFactory;
import com.design.pattern.prototype.OptionalManager;
import lombok.extern.slf4j.Slf4j;

/**
 * @author 玄墨
 * @date 2021/6/21 5:19 下午
 */
@Slf4j
public class TestCase {

    public static void main(String[] args) {
        OptionalManager manager = OptionalManager.Optional.INSTANCE.getInstance();
        MobileProduct product = ProductFactory.genarateProduct(ProductFactory.ProductType.HUAWEI);

        //复制product
        MobileProduct product1 = manager.copy(product);
        System.out.println("原型product对象与复制项product1，对比结果："+(product == product1));
        System.out.println("当前复制面板内存地址集合："+ JSON.toJSONString(manager.getPlateHashCodes()));

        //获取并移除product的复制项-类似粘贴
        MobileProduct product2 = manager.paste(product);
        System.out.println("复制面板内存地址集合："+JSON.toJSONString(manager.getPlate()));
        System.out.println("复制项product1与粘贴项product2，对比结果："+(product1 == product2));

        //对粘贴项product2进行复制
        MobileProduct product3 = manager.copy(product2);
        System.out.println("粘贴项product2与其复制项product3，对比结果："+(product2 == product3));

        System.out.println("复制面板内存地址集合："+JSON.toJSONString(manager.getPlateHashCodes()));
        System.out.println("复制面板内存地址集合："+JSON.toJSONString(manager.getPlate()));

        //撤销复制面板中某个原型的复制项
        manager.cancel(product);

        //清空复制面板
        manager.clear();
        System.out.println("复制面板内存地址集合："+JSON.toJSONString(manager.getPlateHashCodes()));
    }

}
