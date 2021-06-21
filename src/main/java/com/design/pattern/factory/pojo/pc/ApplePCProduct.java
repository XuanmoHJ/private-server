package com.design.pattern.factory.pojo.pc;

/**
 * 子类-苹果
 *
 * @author 玄墨
 * @date 2021/6/21 5:04 下午
 */
public class ApplePCProduct extends PCProduct {

    @Override
    public String display() {
        return "我是苹果电脑产品";
    }

    @Override
    public String feature() {
        return "很贵，但确实好用";
    }
}
