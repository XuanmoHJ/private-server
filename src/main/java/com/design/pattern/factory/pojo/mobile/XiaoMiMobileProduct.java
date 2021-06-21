package com.design.pattern.factory.pojo.mobile;

/**
 * 子类-小米
 *
 * @author 玄墨
 * @date 2021/6/21 5:04 下午
 */
public class XiaoMiMobileProduct extends MobileProduct {

    @Override
    public String display() {
        return "我是小米移动端产品";
    }

    @Override
    public String feature() {
        return "平民化，还不错哦！";
    }
}
