package com.lmx.apiserver.opeartor.per;

/**
 * @author: lmx
 * @create: 2020/8/11
 **/
public class User extends Person {

    @Override
    public void executor() {
        name = "user";
        System.out.println("this is user : " + name);
    }


}
