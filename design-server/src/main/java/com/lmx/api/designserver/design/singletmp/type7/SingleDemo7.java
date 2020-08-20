package com.lmx.api.designserver.design.singletmp.type7;

/**
 * @author: lmx
 * @create: 2020/8/20
 * 使用静态内部类实现 ， 因为类只会加载一次 保证了线程安全
 **/
public class SingleDemo7 {


    private SingleDemo7() {
    }

    private static class SingleDemo7Instance{
        private static final SingleDemo7 INSTANCE = new SingleDemo7();
    }

    public static SingleDemo7 getInstance(){
        return SingleDemo7Instance.INSTANCE;
    }

}
