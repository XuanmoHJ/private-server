package com.design.pattern.factory.method;

import com.design.pattern.factory.pojo.mobile.MobileProduct;
import com.design.pattern.factory.pojo.mobile.XiaoMiMobileProduct;

/**
 * 具体产品工厂-实例化具体产品
 * 小米移动设备工厂
 *
 * @author 玄墨
 * @date 2021/6/21 7:37 下午
 */
public class XiaomiMobileFactory extends AbstractMobileFactory {


    @Override
    public MobileProduct genarateProduct() {
        return new XiaoMiMobileProduct();
    }
}
