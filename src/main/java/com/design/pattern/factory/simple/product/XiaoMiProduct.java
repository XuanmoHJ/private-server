package com.design.pattern.factory.simple.product;

/**
 * 子类-小米
 * @author 玄墨
 * @date 2021/6/21 5:04 下午
 */
public class XiaoMiProduct extends MobileProduct {

    @Override
    public String display() {
        return "我是小米产品";
    }

    @Override
    public String feature() {
        return "平民化，还不错哦！";
    }
}
