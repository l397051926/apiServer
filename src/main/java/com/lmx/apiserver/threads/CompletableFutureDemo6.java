package com.lmx.apiserver.threads;

import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @author: lmx
 * @create: 2021/4/19
 **/
public class CompletableFutureDemo6 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(new Date() + "开始处理");
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> test1());
        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> test2());
        CompletableFuture<String> f3 = CompletableFuture.supplyAsync(() -> test3());
        CompletableFuture<String> f4 = CompletableFuture.supplyAsync(() -> test4());
        CompletableFuture<Void> future = CompletableFuture.allOf(f1, f2, f3, f4);
        future.join();
        System.out.println(new Date() + "数据卡住");
        System.out.println(f1.get());
        System.out.println(f2.get());
        System.out.println(f3.get());
        System.out.println(f4.get());
        System.out.println(new Date() + "结束了");

    }

    private static String test1() {
        try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e) { e.printStackTrace(); }
        return "aaa";
    }
    private static String test2() {
        try { TimeUnit.SECONDS.sleep(3); } catch (InterruptedException e) { e.printStackTrace(); }
        return "bbb";
    }
    private static String test3() {
        try { TimeUnit.SECONDS.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
        return "ccc";
    }
    private static String test4() {
        try { TimeUnit.SECONDS.sleep(8); } catch (InterruptedException e) { e.printStackTrace(); }
        return "ddd";
    }


}
