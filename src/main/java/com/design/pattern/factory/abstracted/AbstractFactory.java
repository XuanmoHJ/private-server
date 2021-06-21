package com.design.pattern.factory.abstracted;

import com.design.pattern.factory.product.mobile.MobileProduct;
import com.design.pattern.factory.product.pc.PCProduct;

/**
 * @author 玄墨
 * @date 2021/6/21 7:37 下午
 */
public abstract class AbstractFactory {

    public abstract MobileProduct genarateMobileProduct();

    public abstract PCProduct genaratePCProduct();
}
