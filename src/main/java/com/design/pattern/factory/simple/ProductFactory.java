package com.design.pattern.factory.simple;

import com.design.pattern.factory.simple.product.AppleProduct;
import com.design.pattern.factory.simple.product.HuaweiProduct;
import com.design.pattern.factory.simple.product.MobileProduct;
import com.design.pattern.factory.simple.product.XiaoMiProduct;

/**
 * 工厂类-根据入参生成具体产品实例
 *
 * @author xiehejun(玄墨)
 * @date 2021/6/18 2:58 下午
 */
public class ProductFactory {


    /**
     * 生成产品
     * @param type
     * @return
     */
    public MobileProduct genarateProduct(ProductType type){
        switch (type){
            case APPLE:
                return new AppleProduct();
            case HUAWEI:
                return new HuaweiProduct();
            case XIAOMI:
                return new XiaoMiProduct();
            default:
                return null;
        }

    }


    public enum ProductType{
        APPLE(0,"苹果"),
        HUAWEI(1,"苹果"),
        XIAOMI(2,"苹果"),
        ;

        private int code;
        private String value;

        ProductType(int code, String value) {
            this.code = code;
            this.value = value;
        }
    }
}
