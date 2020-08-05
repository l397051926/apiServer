package com.lmx.apiserver.threads;

import java.util.concurrent.CompletableFuture;

/**
 * @author: lmx
 * @create: 2020/8/4
 **/
public class CompletableFutureDemo {

    public static void main(String[] args) {
        /**
         * thenAccept 接收上一个阶段结果作为下一个阶段输出
         * thenRun 不关心上一个阶段的结果和输出， 继续执行这个阶段的任务
         */
        CompletableFuture.supplyAsync(()->1)
                .thenApply(i -> i+1)
                .thenApply(i -> i * i)
                .whenComplete((r, e) -> System.out.println(r));

        CompletableFuture.supplyAsync(() -> "hello")
                .thenApply(s -> s + "world")
                .thenApply(String :: toUpperCase)
                .thenCombine(CompletableFuture.completedFuture("JAVA"),
                        (s1, s2) -> s1 + s2)
                .thenAccept(System.out::println);
    }

}
