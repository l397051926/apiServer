package com.lmx.api.designserver.design.singletmp.type3;

/**
 * @author: lmx
 * @create: 2020/8/20
 * 懒汉式 第一种 线程不安全 不可以使用
 **/
public class SingleDemo3 {

    private static SingleDemo3 instance;

    private SingleDemo3() {
    }

    public static SingleDemo3 getInstance() {
        if(instance == null){
            instance = new SingleDemo3();
        }
        return instance;
    }
}
