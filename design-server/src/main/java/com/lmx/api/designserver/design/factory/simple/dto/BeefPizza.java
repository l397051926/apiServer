package com.lmx.api.designserver.design.factory.simple.dto;

/**
 * @author: lmx
 * @create: 2020/8/20
 **/
public class BeefPizza extends Pizza{

    @Override
    public void production() {
        System.out.println("牛肉披萨");
    }
}
