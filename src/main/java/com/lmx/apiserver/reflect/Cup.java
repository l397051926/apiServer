package com.lmx.apiserver.reflect;

import lombok.Data;

/**
 * @author: lmx
 * @create: 2020/8/20
 **/
@Data
public class Cup {

    private Integer id;
    private String name;

    public void seyCup(){
        System.out.println("hello cup");
    }

    public void seyCupByName(String tmp){
        System.out.println("hello cup " + tmp);
    }

}
