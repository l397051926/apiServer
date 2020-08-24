package com.lmx.api.designserver.design.proxy.staticProxy;

/**
 * @author: lmx
 * @create: 2020/8/24
 **/
public class TeacherProxy implements Teacher {

    private TeacherDemo teacherDemo;

    public TeacherProxy(TeacherDemo teacherDemo) {
        this.teacherDemo = teacherDemo;
    }

    @Override
    public void teach() {
        System.out.println("开始代理");
        teacherDemo.teach();
        System.out.println("代理结束了。。。。");

    }
}
