package com.lmx.apiserver.opeartor.per;

/**
 * @author: lmx
 * @create: 2020/8/11
 **/
public class Student extends Person {

    @Override
    public void executor() {
        System.out.println("this is stuent: " + name);

    }

}
