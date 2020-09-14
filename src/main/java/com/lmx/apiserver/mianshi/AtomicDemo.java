package com.lmx.apiserver.mianshi;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: lmx
 * @create: 2020/9/14
 **/
public class AtomicDemo {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(5);
        atomicInteger.compareAndSet(5,2018);
        System.out.println(atomicInteger.get());
    }

}
