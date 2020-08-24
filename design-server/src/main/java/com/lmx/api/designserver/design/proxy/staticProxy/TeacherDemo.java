package com.lmx.api.designserver.design.proxy.staticProxy;

/**
 * @author: lmx
 * @create: 2020/8/24
 **/
public class TeacherDemo implements Teacher {
    @Override
    public void teach() {
        System.out.println("老师在教课");
    }
}
