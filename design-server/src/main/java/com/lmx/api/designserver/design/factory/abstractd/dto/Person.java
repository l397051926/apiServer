package com.lmx.api.designserver.design.factory.abstractd.dto;

/**
 * @author: lmx
 * @create: 2020/8/21
 **/
public abstract class Person {

    protected String name;

    public void eat() {
        System.out.println("吃饭");
    }

    public void read() {
        System.out.println("看书");
    }

    abstract void occupation();

    public void setName(String name) {
        this.name = name;
    }
}
