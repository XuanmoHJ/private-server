package com.design.pattern.factory.abstracted.main;

import com.design.pattern.factory.abstracted.AbstractFactory;
import com.design.pattern.factory.abstracted.AppleFactory;
import com.design.pattern.factory.product.mobile.MobileProduct;
import com.design.pattern.factory.product.pc.PCProduct;

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
