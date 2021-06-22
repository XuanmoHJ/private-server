package com.design.pattern.factory.abstractly;

import com.design.pattern.factory.pojo.mobile.MobileProduct;
import com.design.pattern.factory.pojo.pc.PCProduct;

/**
 * 抽象工厂模式-抽象工厂
 * 提供创建产品族的方法，每一个方法对应一种产品
 *
 * @author 玄墨
 * @date 2021/6/21 7:37 下午
 */
public abstract class AbstractFactory {

    /**
     * 创建移动设备产品
     *
     * @return
     */
    public abstract MobileProduct genarateMobileProduct();

    /**
     * 创建PC端设备产品
     *
     * @return
     */
    public abstract PCProduct genaratePCProduct();
}
