package com.design.pattern.factory.product.pc;

import lombok.Data;

import java.io.Serializable;

/**
 * 产品抽象类，所有产品的父类，提供公共信息
 *
 * @author 玄墨
 * @date 2021/6/21 4:37 下午
 */
@Data
public abstract class PCProduct implements Serializable {

    /**
     * 规格
     */
    private String specification;

    /**
     * 公司
     */
    private String company;

    /**
     * 长度
     */
    private double length;

    /**
     * 宽度
     */
    private double wildth;

    /**
     * 重量
     */
    private double weigth;

    /**
     * 版本
     */
    private String version;

    /**
     * 芯片
     */
    private String chip;

    /**
     * 展示
     *
     * @return
     */
    public abstract String display();

    /**
     * 特性
     *
     * @return
     */
    public abstract String feature();


}
