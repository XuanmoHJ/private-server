package com.design.pattern.singleton;

/**
 * 饿汉模式-启动时即加载，对内存有损耗，基于jvm类加载机制无需关心线程安全问题，但可通过反射机制破坏唯一性
 *
 * @author 玄墨
 * @date 2021/6/17 8:51 下午
 */
public class HungrySinleton {
    private static HungrySinleton instance = new HungrySinleton();

    private HungrySinleton() {
    }

    ;

    public static HungrySinleton getInstance() {
        return instance;
    }
}
