package com.lmx.apiserver.mianshi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author: lmx
 * @create: 2020/9/14
 **/
public class AtomicDemo1 {
    static AtomicInteger integer = new AtomicInteger(0);

    public static void main(String[] args) {

        ExecutorService workerServer = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 100; i++) {
            workerServer.execute(() -> {
                integer.getAndAdd(1);
                System.out.println(integer.get());
            });
        }

    }
}
