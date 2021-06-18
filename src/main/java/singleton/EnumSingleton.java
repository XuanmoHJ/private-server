package singleton;

/**
 * 枚举模式
 * 反射安全/序列化和反序列化安全/写法简单
 * @author xiehejun(玄墨)
 * @date 2021/6/18 10:15 上午
 */
public enum EnumSingleton {
    INSTANCE;

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
