package com.design.pattern.factory.method;

import com.design.pattern.factory.product.mobile.MobileProduct;
import com.design.pattern.factory.product.mobile.XiaoMiMobileProduct;

/**
 * @author 玄墨
 * @date 2021/6/21 7:37 下午
 */
public class XiaomiMobileFactory extends AbstractMobileFactory {


    @Override
    public MobileProduct genarateProduct() {
        return new XiaoMiMobileProduct();
    }
}
