package com.lmx.api.designserver.design.singletmp.type5;

/**
 * @author: lmx
 * @create: 2020/8/20
 * 懒汉式 代码块形式锁 无法保证线程安全 因为只要进入if 判断就会出现问题
 **/
public class SingleDemo5 {

    private static SingleDemo5 instance;

    public SingleDemo5() {
    }

    public static SingleDemo5 getInstance() {
        if(instance == null){
            synchronized (SingleDemo5.class){
                instance = new SingleDemo5();
            }
        }

        return instance;
    }
}
