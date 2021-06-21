package com.design.pattern.factory.simple;

import com.design.pattern.factory.simple.product.MobileProduct;

/**
 * @author 玄墨
 * @date 2021/6/21 5:19 下午
 */
public class TestCase {

    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();
        MobileProduct product = factory.genarateProduct(ProductFactory.ProductType.APPLE);
        System.out.println(product.display());
        System.out.printf(product.feature());
    }
}
