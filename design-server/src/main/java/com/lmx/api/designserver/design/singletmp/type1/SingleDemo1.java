package com.lmx.api.designserver.design.singletmp.type1;

/**
 * @author: lmx
 * @create: 2020/8/20
 * 饿汉式 第一种方式
 **/
public class SingleDemo1 {

    private static final SingleDemo1 instance = new SingleDemo1();

    private SingleDemo1() {
    }

    public static SingleDemo1 getInstance(){
        return instance;
    }
}
