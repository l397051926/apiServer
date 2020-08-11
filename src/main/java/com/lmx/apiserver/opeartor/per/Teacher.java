package com.lmx.apiserver.opeartor.per;

/**
 * @author: lmx
 * @create: 2020/8/11
 **/
public class Teacher extends Person {

    @Override
    public void executor() {
        name = "teacher";
        System.out.println("this is teacher: " + name);
    }
}
