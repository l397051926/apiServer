package com.lmx.apiserver.threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * @author: lmx
 * @create: 2020/8/5
 **/
public class CompletableFutureDemo2 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //使用 handle() 方法处理异常 API提供了一个更通用的方法 - handle()从异常恢复，无论一个异常是否发生它都会被调用。
        Integer age = 10;

        CompletableFuture<String> maturityFuture = CompletableFuture.supplyAsync(() -> {
            if(age < 0) {
                throw new IllegalArgumentException("Age can not be negative");
            }
            if(age > 18) {
                return "Adult";
            } else {
                return "Child";
            }
        }).handle((res, ex) -> {
            if(ex != null) {
                System.out.println("Oops! We have an exception - " + ex.getMessage());
                return "Unknown!";
            }
            // handle 可以改变输出结果
            return "hheda";
        });

        System.out.println("Maturity : " + maturityFuture.get());

    }

}
