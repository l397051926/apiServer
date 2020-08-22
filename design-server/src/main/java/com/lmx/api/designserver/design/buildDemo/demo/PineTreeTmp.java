package com.lmx.api.designserver.design.buildDemo.demo;

/**
 * @author: lmx
 * @create: 2020/8/21
 **/
public class PineTreeTmp extends TreeTmp {



    @Override
    public void buyTree() {
        System.out.println(name +"  购买胡杨树");
    }

    @Override
    public void watering() {
        System.out.println(name +"  给胡杨浇水");
    }

    @Override
    public void sun() {
        System.out.println(name +"  让胡杨晒太阳");
    }
}
