package com.design.pattern.factory.abstractly.main;

import com.design.pattern.factory.abstractly.AbstractFactory;
import com.design.pattern.factory.abstractly.AppleFactory;
import com.design.pattern.factory.pojo.mobile.MobileProduct;
import com.design.pattern.factory.pojo.pc.PCProduct;

/**
 * @author 玄墨
 * @date 2021/6/21 5:19 下午
 */
public class TestCase {

    public static void main(String[] args) {

        AbstractFactory factory = new AppleFactory();
        MobileProduct mobileProduct = factory.genarateMobileProduct();
        System.out.println(mobileProduct.display());
        System.out.println(mobileProduct.feature());

        PCProduct pcProduct = factory.genaratePCProduct();
        System.out.println(pcProduct.display());
        System.out.println(pcProduct.feature());
    }
}
