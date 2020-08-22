package com.lmx.api.designserver.design.buildDemo;

import com.lmx.api.designserver.design.buildDemo.demo.PineTreeTmp;
import com.lmx.api.designserver.design.buildDemo.demo.TreeTmp;

/**
 * @author: lmx
 * @create: 2020/8/21
 **/
public class HelloBuild {

    public static void main(String[] args) {
        demoTest();
    }

    public static void demoTest(){
        TreeTmp treeTmp = new PineTreeTmp();
        treeTmp.setName("呵呵哒");
        treeTmp.plant();
    }
}
