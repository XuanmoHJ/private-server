package com.design.pattern.factory.method.main;

import com.design.pattern.factory.method.AbstractMobileFactory;
import com.design.pattern.factory.method.AppleMobileFactory;
import com.design.pattern.factory.product.mobile.MobileProduct;

/**
 * @author 玄墨
 * @date 2021/6/21 5:19 下午
 */
public class TestCase {

    public static void main(String[] args) {

        AbstractMobileFactory factory = new AppleMobileFactory();
        MobileProduct product = factory.genarateProduct();
        System.out.println(product.display());
        System.out.printf(product.feature());
    }
}
