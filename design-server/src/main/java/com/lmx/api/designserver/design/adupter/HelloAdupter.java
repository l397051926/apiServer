package com.lmx.api.designserver.design.adupter;

import com.lmx.api.designserver.design.adupter.classAdupter.PhoneAdupter;
import com.lmx.api.designserver.design.adupter.classAdupter.dto.Phone;

/**
 * @author: lmx
 * @create: 2020/8/22
 **/
public class HelloAdupter {
    /**
     * 适配器模式， 用于关联两个不相干的接口，实现关联 进行功能开发
     *
     */
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.chongDian(new PhoneAdupter());
    }
}
