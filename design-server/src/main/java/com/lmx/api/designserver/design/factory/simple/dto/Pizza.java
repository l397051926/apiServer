package com.lmx.api.designserver.design.factory.simple.dto;

/**
 * @author: lmx
 * @create: 2020/8/20
 **/
public abstract class Pizza {

    private String name;

    public abstract void production();

    public void bake(){
        System.out.println(name + " 开始烘培");
    }

    public void cut(){
        System.out.println(name + "开始切割");
    }

    public void pack(){
        System.out.println(name + "开始打包");
    }

    public void setName(String name) {
        this.name = name;
    }
}
