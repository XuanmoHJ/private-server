package singleton;

/**
 * 静态内部实例化模式(IoDH技术-Initialization Demand Holde)
 * @author xiehejun(玄墨)
 * @date 2021/6/18 10:07 上午
 */
public class InnerStaticSinleton {
    private InnerStaticSinleton(){};

    private static class Holde {
        private static InnerStaticSinleton instance = new InnerStaticSinleton();
    }

    public static InnerStaticSinleton getInstance(){
        return Holde.instance;
    }

}
