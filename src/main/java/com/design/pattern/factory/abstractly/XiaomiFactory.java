package com.design.pattern.factory.abstractly;

import com.design.pattern.factory.pojo.mobile.MobileProduct;
import com.design.pattern.factory.pojo.mobile.XiaoMiMobileProduct;
import com.design.pattern.factory.pojo.pc.PCProduct;
import com.design.pattern.factory.pojo.pc.XiaoMiPCProduct;

/**
 * 具体工厂-抽象工厂的具体实现，可创建具体的产品，从而构成一组产品族
 * 华为产品族
 *
 * @author 玄墨
 * @date 2021/6/21 8:56 下午
 */
public class XiaomiFactory extends AbstractFactory {

    @Override
    public MobileProduct genarateMobileProduct() {
        return new XiaoMiMobileProduct();
    }

    @Override
    public PCProduct genaratePCProduct() {
        return new XiaoMiPCProduct();
    }
}
