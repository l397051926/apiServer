package com.lmx.api.designserver.design.adupter.classAdupter;

/**
 * @author: lmx
 * @create: 2020/8/22
 **/
public class PhoneAdupter extends HighVoltage implements PhoneVoltage{

    @Override
    public void outV() {
        System.out.println("输出5v 的电压");
    }
}
