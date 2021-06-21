package com.design.pattern.factory.product.pc;

/**
 * 子类-华为
 *
 * @author 玄墨
 * @date 2021/6/21 5:04 下午
 */
public class HuaweiPCProduct extends PCProduct {

    @Override
    public String display() {
        return "我是华为电脑产品";
    }

    @Override
    public String feature() {
        return "美观，性价比还不错，竞争力提升很快";
    }
}
