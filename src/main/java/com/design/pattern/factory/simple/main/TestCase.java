package com.design.pattern.factory.simple.main;

import com.design.pattern.factory.pojo.mobile.MobileProduct;
import com.design.pattern.factory.simple.ProductFactory;

/**
 * @author 玄墨
 * @date 2021/6/21 5:19 下午
 */
public class TestCase {

    public static void main(String[] args) {
        MobileProduct product = ProductFactory.genarateProduct(ProductFactory.ProductType.HUAWEI);
        System.out.println(product.display());
        System.out.printf(product.feature());
    }
}
