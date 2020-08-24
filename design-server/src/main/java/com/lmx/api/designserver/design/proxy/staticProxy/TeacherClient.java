package com.lmx.api.designserver.design.proxy.staticProxy;

/**
 * @author: lmx
 * @create: 2020/8/24
 **/
public class TeacherClient {

    public static void main(String[] args) {
        TeacherDemo teacherDemo = new TeacherDemo();
        TeacherProxy teacherProxy = new TeacherProxy(teacherDemo);
        teacherProxy.teach();
    }

}
