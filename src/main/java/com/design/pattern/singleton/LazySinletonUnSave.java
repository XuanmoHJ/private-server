package com.design.pattern.singleton;

/**
 * 懒汉模式-使用时进行初始化，存在线程安全问题
 * 当A，B线程同时调用时，会产生多个实例，不能确保唯一性
 *
 * @author 玄墨
 * @date 2021/6/17 8:51 下午
 */
public class LazySinletonUnSave {
    private static LazySinletonUnSave instance = null;

    private LazySinletonUnSave() {
    }

    ;

    public static LazySinletonUnSave getInstance() {
        if (instance == null) {
            instance = new LazySinletonUnSave();
        }
        return instance;

    }
}
