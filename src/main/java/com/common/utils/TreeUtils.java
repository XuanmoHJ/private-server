package com.common.utils;

import lombok.extern.slf4j.Slf4j;

import java.io.ObjectInputStream;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 树形结构工具类
 * @author 玄墨
 * @date 2021/7/12 4:39 下午
 */
@Slf4j
public class TreeUtils<E> {

    /**
     * 非嵌套list 集合 生成树形结构数据
     * @param collect
     * @param <E>
     * @return
     */
    public static<E extends NodeEntity> List<E>  buildTree(List<E> collect){

       return collect.stream().parallel().map(tree->{
            List<E> children = collect.stream().filter(b -> Objects.equals(tree.getId(),b.getPid())).collect(Collectors.toList());
            tree.setChildren((List<NodeEntity>) children);
            return tree;
        }).filter(f -> f.getPid() == 0 || Objects.isNull(f.getPid())).collect(Collectors.toList());

    }

    public  static <E extends NodeEntity> List<E> searchNode(List<E> tree , int id){
        return searchNode(tree,0,id);
    }

    public  static <E extends NodeEntity> List<E> searchNode(List<E> tree , String name){
        return searchNode(tree,1,name);
    }

    private static <E extends NodeEntity> List<E> searchNode(List<E> tree , int type , Object param){
       return tree.stream().parallel().map(t->{
            //not-leaf-node ,traverse continue
            if(t.isHasChildren()){
                List<NodeEntity> nodeEntities = searchNode(t.getChildren(), type, param);
                //chuild-list not match param and remove them
                if(nodeEntities.isEmpty()){
                    return null;
                }
                t.setChildren(nodeEntities);
            }else if(!(Objects.equals(type,0)&&Objects.equals(t.getId(),param))
                    && !(Objects.equals(type,1)&&Objects.equals(t.getName(),param))){
                return null;
            }
            return t;
        }).filter(Objects::nonNull).collect(Collectors.toList());
    }

}
