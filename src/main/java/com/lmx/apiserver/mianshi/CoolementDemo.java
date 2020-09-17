package com.lmx.apiserver.mianshi;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author: lmx
 * @create: 2020/9/17
 **/
public class CoolementDemo {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        List<String> list = new Vector<>();
//        List<String> list = Collections.synchronizedList(new ArrayList<>());
        List<String> list = new CopyOnWriteArrayList();
        for (int i = 0; i < 30; i++) {
            CompletableFuture.runAsync(() -> {
                list.add(UUID.randomUUID().toString().substring(0,8));
                System.out.println(list);
            });
        }

    }

}
