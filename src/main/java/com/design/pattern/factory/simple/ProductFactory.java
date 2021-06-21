package com.design.pattern.factory.simple;

import com.design.pattern.factory.pojo.mobile.AppleMobileProduct;
import com.design.pattern.factory.pojo.mobile.HuaweiMobileProduct;
import com.design.pattern.factory.pojo.mobile.MobileProduct;
import com.design.pattern.factory.pojo.mobile.XiaoMiMobileProduct;

/**
 * 工厂类-根据入参生成具体产品实例
 *
 * @author 玄墨
 * @date 2021/6/18 2:58 下午
 */
public class ProductFactory {


    /**
     * 生成产品
     *
     * @param type
     * @return
     */
    public static MobileProduct genarateProduct(ProductType type) {
        switch (type) {
            case APPLE:
                return new AppleMobileProduct();
            case HUAWEI:
                return new HuaweiMobileProduct();
            case XIAOMI:
                return new XiaoMiMobileProduct();
            default:
                return null;
        }

    }


    public enum ProductType {
        APPLE(0, "苹果"),
        HUAWEI(1, "苹果"),
        XIAOMI(2, "苹果"),
        ;

        private int code;
        private String value;

        ProductType(int code, String value) {
            this.code = code;
            this.value = value;
        }
    }
}
