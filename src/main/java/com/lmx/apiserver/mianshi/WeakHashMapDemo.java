package com.lmx.apiserver.mianshi;

import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

/**
 * @author: lmx
 * @create: 2020/10/12
 **/
public class WeakHashMapDemo {

    public static void main(String[] args) {
//        myHashMap();
        myWeakHashMap();
    }

    private static void myWeakHashMap() {
        WeakHashMap<Integer,String> map = new WeakHashMap<>();
        Integer key = 2;
        String value = "weekhashMap";
        map.put(key,value);
        System.out.println(map);

        key = null;
        System.out.println(map);
        System.gc();
        try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println(key);

    }

    private static void myHashMap() {
        HashMap<Integer,String> map = new HashMap<>();
        Integer key = 1;
        String value = "hashMap";
        map.put(key,value);
        System.out.println(map);

        key = null;
        System.out.println(map);

        System.gc();
        System.out.println(map);

    }

}
