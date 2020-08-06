package com.lmx.apiserver.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author: lmx
 * @create: 2020/8/5
 **/
public class CompletableFutureDemo4 {

    public static void main(String[] args) {
        ExecutorService workerServer = SingleExecutorService.getInstance().getWorkerServer();
        List<CompletableFuture<Void>> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            int finalI = i;
            list.add(CompletableFuture.runAsync(()->{
                try {
                    TimeUnit.SECONDS.sleep(3);
                    System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName() + "thread id: " + Thread.currentThread().getId() + " -- i = " + finalI);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            },workerServer));
        }
        CompletableFuture.allOf();
        System.out.println("main is end");
    }
}
