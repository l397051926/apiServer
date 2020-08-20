package com.lmx.apiserver.design.singlebilility;

/**
 * @author: lmx
 * @create: 2020/8/18
 **/
public class SingleResponsibility {
    /**
     * 单一职责， 每个类 或者每个函数都保持独立的规则，这样可以在后期修改别的功能不会影响到这里
     */

    public static void main(String[] args) {
        Traffic traffic = new Traffic();
        traffic.run("汽车");
        traffic.airRun("飞机");
        traffic.worterRun("火车");


    }

}

/**
 * 函数上单一职责
 *
 */
class Traffic{

    public void run(String tool){
        System.out.println(tool + "正在路地上跑");
    }

    public void airRun(String tool){
        System.out.println(tool + "正在控中飞");

    }

    public void worterRun(String tool){
        System.out.println(tool + "正在水里 航行");

    }

}
