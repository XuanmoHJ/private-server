package com.design.pattern.factory.method;

import com.design.pattern.factory.pojo.mobile.MobileProduct;

/**
 * 工厂方法模式-抽象工厂，提供创建产品方法
 *
 * @author 玄墨
 * @date 2021/6/21 7:37 下午
 */
public abstract class AbstractMobileFactory {

    public abstract MobileProduct genarateProduct();

}
