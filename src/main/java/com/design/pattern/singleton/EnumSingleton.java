package com.design.pattern.singleton;

/**
 * 枚举模式
 * 反射安全/序列化和反序列化安全/写法简单
 *
 * @author 玄墨
 * @date 2021/6/18 10:15 上午
 */
public class EnumSingleton {
    private EnumSingleton(){}

    public enum SingletonEnum {
        SINGLETON;
        private EnumSingleton instance;

        SingletonEnum() {
            instance = new EnumSingleton();
        }
        public EnumSingleton getInstance() {
            return instance;
        }
    }
}
