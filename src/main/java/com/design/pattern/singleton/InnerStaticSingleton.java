package com.design.pattern.singleton;

/**
 * 静态内部实例化模式(IoDH技术-Initialization Demand Holde)
 *
 * @author 玄墨
 * @date 2021/6/18 10:07 上午
 */
public class InnerStaticSingleton {
    private InnerStaticSingleton() {
    }

    public static InnerStaticSingleton getInstance() {
        return Holde.instance;
    }

    private static class Holde {
        private static InnerStaticSingleton instance = new InnerStaticSingleton();
    }

}
