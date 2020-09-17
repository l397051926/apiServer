package com.lmx.apiserver.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author: lmx
 * @create: 2020/9/17
 **/
public class FutureDemo1 {

    public static void main(String[] args) {
//        threadTest();
//        comfuntureTest();
        comfurtureTest2();

    }

    public static void threadTest() {
        for (int i = 0; i < 30; i++) {
            int finalI = i;
            new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName()+"=------");
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(finalI);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, String.valueOf(i)).start();
        }
    }

    public static void comfuntureTest() {
        for (int i = 0; i < 30; i++) {
            int finalI = i;
            CompletableFuture.runAsync(() -> {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(Thread.currentThread().getName()+"=------");
                    System.out.println(finalI);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }
    }

    public static void comfurtureTest2(){
        List<CompletableFuture> list = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            int finalI = i;
            CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println(Thread.currentThread().getName()+"=------");
                    System.out.println(finalI);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            list.add(future);
        }
        list.forEach(CompletableFuture::join);
    }


}
