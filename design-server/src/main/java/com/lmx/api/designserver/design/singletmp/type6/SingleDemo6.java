package com.lmx.api.designserver.design.singletmp.type6;

/**
 * @author: lmx
 * @create: 2020/8/20
 * 双重校验机智 保证线程安全 性能得到优化
 **/
public class SingleDemo6 {
    /**
     * 解决指令重排序
     */
    private static volatile SingleDemo6 instance;

    public SingleDemo6() {
    }


    public static SingleDemo6 getInstance() {
        if(instance == null){
            synchronized (SingleDemo6.class){
                if (instance ==null){
                    instance = new SingleDemo6();
                }
            }
        }

        return instance;
    }
}
