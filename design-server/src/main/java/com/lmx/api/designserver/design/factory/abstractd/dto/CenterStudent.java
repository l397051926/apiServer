package com.lmx.api.designserver.design.factory.abstractd.dto;

/**
 * @author: lmx
 * @create: 2020/8/21
 **/
public class CenterStudent extends Person {

    @Override
    void occupation() {
        System.out.println(name + "我是一名中学生");
    }
}
