package com.common.utils;

import lombok.Data;

import java.util.List;

/**
 * 节点实体
 * @author 玄墨
 * @date 2021/7/12 4:42 下午
 */
@Data
public class NodeEntity {
    private int pid;
    private int id;
    private String name;
    private int level;
    private boolean hasChildren;
    private List<NodeEntity> children;
}
