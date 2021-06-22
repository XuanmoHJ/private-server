package com.design.pattern.factory.abstractly;

import com.design.pattern.factory.pojo.mobile.HuaweiMobileProduct;
import com.design.pattern.factory.pojo.mobile.MobileProduct;
import com.design.pattern.factory.pojo.pc.HuaweiPCProduct;
import com.design.pattern.factory.pojo.pc.PCProduct;

/**
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
