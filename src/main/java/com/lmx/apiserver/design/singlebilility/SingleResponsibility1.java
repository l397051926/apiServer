package com.lmx.apiserver.design.singlebilility;

/**
 * @author: lmx
 * @create: 2020/8/18
 **/
public class SingleResponsibility1 {


    public static void main(String[] args) {

    }

}

/**
 * 类 中单一职责功能
 */
class Traffic1{

    public void run(String tool){
        System.out.println(tool + "正在路上跑...");
    }

}
class AirTraffic1{

    public void run(String tool){
        System.out.println(tool + "正在路上跑...");
    }

}
class WarterTraffic1{

    public void run(String tool){
        System.out.println(tool + "正在路上跑...");
    }

}
