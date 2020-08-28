package com.lmx.apiserver.threads;

import java.util.concurrent.TimeUnit;

/**
 * @author: lmx
 * @create: 2020/8/24
 **/
public class CompletableFutureDemo5 {

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            int finalI = i;
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName() + "thread id: " + Thread.currentThread().getId() + " -- i = " + finalI);
        }
    }

}

