package com.design.pattern.factory.method;

import com.design.pattern.factory.pojo.mobile.MobileProduct;

/**
 * @author 玄墨
 * @date 2021/6/21 7:37 下午
 */
public abstract class AbstractMobileFactory {

    public abstract MobileProduct genarateProduct();

}
