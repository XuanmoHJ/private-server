package com.design.pattern.factory.abstracted;

import com.design.pattern.factory.pojo.mobile.AppleMobileProduct;
import com.design.pattern.factory.pojo.mobile.MobileProduct;
import com.design.pattern.factory.pojo.pc.ApplePCProduct;
import com.design.pattern.factory.pojo.pc.PCProduct;

/**
 * @author 玄墨
 * @date 2021/6/21 8:56 下午
 */
public class AppleFactory extends AbstractFactory {

    @Override
    public MobileProduct genarateMobileProduct() {
        return new AppleMobileProduct();
    }

    @Override
    public PCProduct genaratePCProduct() {
        return new ApplePCProduct();
    }
}
