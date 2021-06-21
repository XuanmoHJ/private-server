package com.design.pattern.factory.simple.product;

/**
 * 子类-苹果
 * @author 玄墨
 * @date 2021/6/21 5:04 下午
 */
public class AppleProduct extends MobileProduct {

    @Override
    public String display() {
        return "我是苹果产品";
    }

    @Override
    public String feature() {
        return "很贵，但确实好用";
    }
}