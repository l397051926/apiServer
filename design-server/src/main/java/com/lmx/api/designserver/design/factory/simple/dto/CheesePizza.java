package com.lmx.api.designserver.design.factory.simple.dto;

/**
 * @author: lmx
 * @create: 2020/8/20
 **/
public class CheesePizza extends Pizza{

    @Override
    public void production() {
        System.out.println("芝士披萨");
    }
}
