package com.lmx.apiserver.mianshi;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author: lmx
 * @create: 2020/9/17
 **/
public class CollectionsDemo2 {

    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        Set<String> set = Collections.synchronizedSet(new HashSet<>());
        Set<String> set = new CopyOnWriteArraySet();

        for (int i = 0; i < 30; i++) {
            new Thread(() -> {

            }).start();
        }
    }

}
