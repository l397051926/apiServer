package com.lmx.apiserver.ower;

import com.lmx.apiserver.entity.User;

import java.util.HashMap;

/**
 * @author: lmx
 * @create: 2020/8/5
 **/
public class ObjectDemo {

    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.hashCode());
        System.out.println(hash(user.hashCode()));

    }

    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

}
