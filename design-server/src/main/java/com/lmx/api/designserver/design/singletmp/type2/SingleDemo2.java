package com.lmx.api.designserver.design.singletmp.type2;

/**
 * @author: lmx
 * @create: 2020/8/20
 * 饿汉式 第二种方法 保证线程安全
 **/
public class SingleDemo2 {

    private static SingleDemo2 instance;

    static {
        instance = new SingleDemo2();
    }

    private SingleDemo2() {
    }

    public static SingleDemo2 getInstance() {
        return instance;
    }
}
