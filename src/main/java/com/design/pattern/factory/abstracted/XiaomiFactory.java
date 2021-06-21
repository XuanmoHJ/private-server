package com.design.pattern.factory.abstracted;

import com.design.pattern.factory.pojo.mobile.MobileProduct;
import com.design.pattern.factory.pojo.mobile.XiaoMiMobileProduct;
import com.design.pattern.factory.pojo.pc.PCProduct;
import com.design.pattern.factory.pojo.pc.XiaoMiPCProduct;

/**
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
