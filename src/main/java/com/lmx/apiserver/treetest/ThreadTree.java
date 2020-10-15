package com.lmx.apiserver.treetest;

/**
 * @author: lmx
 * @create: 2020/10/15
 **/
public class ThreadTree {

    Integer data;
    ThreadTree left;
    ThreadTree right;
    Integer lTag;
    Integer rTag;

    public ThreadTree(Integer data) {
        this.data = data;
    }
}
