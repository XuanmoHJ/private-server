package com.design.pattern.prototype;

import com.common.utils.ObjectUtils;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

/**
 * 操作管理器
 * 复制，撤销 ，粘贴
 * <p>
 * 单例模式-实现管理器唯一
 *
 * @author 玄墨
 * @date 2021/6/22 5:07 下午
 */
public class OptionalManager {

    private ConcurrentHashMap<Integer,Object> map = new ConcurrentHashMap();

    private OptionalManager() {
    }

    /**
     * 复制某一个对象，并返回该复制项
     * @param obj
     * @param <T>
     * @return
     */
    public <T extends Serializable> T copy(T obj) {
        T cloneObject = ObjectUtils.cloneObject(obj);
        int key = System.identityHashCode(obj);
        map.put(key,cloneObject);
        return cloneObject;
    }

    /**
     * 获取并移除某一个对象的复制项
     * @param obj
     * @param <T>
     * @return
     */
    public <T extends Serializable> T paste(T obj) {
        T t = (T)map.get(System.identityHashCode(obj));
        cancel(obj);
        return t;
    }

    /**
     * 获取复制面板数据
     * @return
     */
    public Map<Integer,Object> getPlate() {
        return map;
    }

    /**
     * 获取复制面板中所有数据的内存地址集合
     * @return
     */
    public List<Integer> getPlateHashCodes() {
        if(Objects.isNull(map) || map.size() == 0){
            return Collections.emptyList();
        }
        return map.entrySet().stream().map(e->e.getKey()).collect(Collectors.toList());
    }

    /**
     * 撤销某一个对象的复制项
     * @param obj
     */
    public void cancel(Object obj) {
        map.remove(System.identityHashCode(obj));
    }

    /**
     * 清空复制面板
     */
    public void clear() {
        map = new ConcurrentHashMap();
    }


    /**
     * 枚举方式实现单例
     */
    public enum Optional {
        INSTANCE;

        private OptionalManager instance;

        Optional() {
            instance = new OptionalManager();
        }

        public OptionalManager getInstance() {
            return instance;
        }
    }


}
