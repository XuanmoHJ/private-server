package com.design.pattern.singleton;

/**
 * 懒汉模式-使用时进行初始化，为解决线程安全问题引入同步锁
 * 依旧存在线程安全问题：当A，B线程同时调用时，虽然加了锁，A阻塞了B线程，但A线程完成，B线程获取锁之后会产生多实例问题
 *
 * @author 玄墨
 * @date 2021/6/17 8:51 下午
 */
public class LazySyncSinleton {
    private static LazySyncSinleton instance = null;

    private LazySyncSinleton() {
    }

    ;

    public static LazySyncSinleton getInstance() {
        if (instance == null) {
            synchronized (LazySyncSinleton.class) {
                instance = new LazySyncSinleton();
            }
        }
        return instance;

    }
}
