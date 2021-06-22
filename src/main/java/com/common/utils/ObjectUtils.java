package com.common.utils;

import lombok.extern.slf4j.Slf4j;

import java.io.*;

/**
 * 对象工具类
 * @author 玄墨
 * @date 2021/6/22 11:40 上午
 */
@Slf4j
public class ObjectUtils {

    /**
     * 序列化方式-深度拷贝
     * @param obj
     * @param <T>
     * @return
     */
    public static <T extends Serializable> T cloneObject(T obj) {
        T cloneObj = null;

        try {
            //对象写入字节流
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(obj);
            oos.close();

            //读取字节流，并生成新对象
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            cloneObj = (T) ois.readObject();
            ois.close();
        } catch (Exception e) {
            log.error("clone object fail. error:{}",e);
        }
        return cloneObj;

    }
}
