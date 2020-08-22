package com.lmx.api.designserver.design.buildDemo.demo;

/**
 * @author: lmx
 * @create: 2020/8/21
 **/
public abstract class TreeTmp {
    protected String name;

    public void plant(){
        buyTree();
        watering();
        sun();
    }

    public abstract void buyTree();
    public abstract void watering();
    public abstract void sun();

    public void setName(String name) {
        this.name = name;
    }
}
