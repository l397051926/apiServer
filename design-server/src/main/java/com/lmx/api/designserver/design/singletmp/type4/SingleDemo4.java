package com.lmx.api.designserver.design.singletmp.type4;

/**
 * @author: lmx
 * @create: 2020/8/20
 * 懒汉式 加锁方式 消耗过大
 **/
public class SingleDemo4 {

    private static SingleDemo4 instance;

    private SingleDemo4() {
    }

    public static synchronized SingleDemo4  getInstance() {

        if(instance == null){
            instance = new SingleDemo4();
        }
        return instance;
    }
}
