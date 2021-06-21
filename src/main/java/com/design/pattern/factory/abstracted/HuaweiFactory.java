package com.design.pattern.factory.abstracted;

import com.design.pattern.factory.product.mobile.HuaweiMobileProduct;
import com.design.pattern.factory.product.mobile.MobileProduct;
import com.design.pattern.factory.product.pc.HuaweiPCProduct;
import com.design.pattern.factory.product.pc.PCProduct;

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
