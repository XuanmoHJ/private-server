package com.design.pattern.singleton;

/**
 * 双重校验模式-在懒汉模式同步锁的情况下,初始化实例时，再次判断是否为空，无线程安全问题，且实现了延迟加载
 *
 * @author 玄墨
 * @date 2021/6/17 8:51 下午
 */
public class ReValidateSingleton {
    private static ReValidateSingleton instance = null;

    private ReValidateSingleton() {
    }

    ;

    public static ReValidateSingleton getInstance() {
        if (instance == null) {
            synchronized (ReValidateSingleton.class) {
                if (instance == null) {
                    instance = new ReValidateSingleton();
                }
            }
        }
        return instance;

    }
}
