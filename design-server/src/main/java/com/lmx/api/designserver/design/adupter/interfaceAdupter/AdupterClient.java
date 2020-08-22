package com.lmx.api.designserver.design.adupter.interfaceAdupter;

/**
 * @author: lmx
 * @create: 2020/8/22
 **/
public class AdupterClient {

    public static void main(String[] args) {
        AdupterAbstract adupterAbstract = new AdupterAbstract() {
            @Override
            public void m1() {
                System.out.println("hello hehehehda ");
            }
        };
        adupterAbstract.m1();
    }
}
