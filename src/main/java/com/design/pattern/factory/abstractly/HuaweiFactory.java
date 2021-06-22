package com.design.pattern.factory.abstractly;

import com.design.pattern.factory.pojo.mobile.HuaweiMobileProduct;
import com.design.pattern.factory.pojo.mobile.MobileProduct;
import com.design.pattern.factory.pojo.pc.HuaweiPCProduct;
import com.design.pattern.factory.pojo.pc.PCProduct;

/**
 * 具体工厂-抽象工厂的具体实现，可创建具体的产品，从而构成一组产品族
 * 华为产品族
 * @author 玄墨
 * @date 2021/6/21 8:56 下午
 */
public class HuaweiFactory extends AbstractFactory {

    @Override
    public MobileProduct genarateMobileProduct() {
        return new HuaweiMobileProduct();
    }

    @Override
    public PCProduct genaratePCProduct() {
        return new HuaweiPCProduct();
    }
}
