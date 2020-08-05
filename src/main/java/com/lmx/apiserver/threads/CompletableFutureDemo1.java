package com.lmx.apiserver.threads;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

/**
 * @author: lmx
 * @create: 2020/8/4
 **/
public class CompletableFutureDemo1 {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        CompletableFuture.runAsync(() ->{
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }).thenRun(()->{
//            System.out.println(1);
//        });
//        CompletableFuture<Void> fu = CompletableFuture.runAsync(() -> System.out.println(Thread.currentThread().getName() + ": name"));
//        fu.get();
//        CompletableFuture<String> future = CompletableFuture.supplyAsync(new Supplier<String>() {
//            @Override
//            public String get() {
//                System.out.println("the thread name: " + Thread.currentThread().getName());
//                return "呵呵呵呵呵呵的";
//            }
//        });
//        String s = future.get();
//        System.out.println(s);

//        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
//            System.out.println("this thread name: " + Thread.currentThread().getName());
//            return "hello";
//        });
//        String s = future.get();
//        System.out.println(s);
//        System.out.println("s = " + s);

//        ExecutorService workerServer = SingleExecutorService.getInstance().getWorkerServer();
//        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> {
//            System.out.println("this thread name: " + Thread.currentThread().getName());
//            return "hello";
//        }, workerServer);
//        String s = future.get();
//        System.out.println("s = " + s);


//        CompletableFuture<Object> cf = CompletableFuture.supplyAsync();//异步执行实例
//     *   cf.thenAccept();//获取结果后的操作
//      *  cf.exceptionally()//获取异常的操作
//     *   get() 会阻塞 直到程序执行完毕
        //* 使用 runAsync() 运行异步计算 不反回任何东西
//   *     使用 supplyAsync() 运行一个异步任务并且返回结果

//  *    thenApply() 可以使用 thenApply() 处理和改变CompletableFuture的结果。持有一个Function<R,T>作为参数。
//   *   Function<R,T>是一个简单的函数式接口，接受一个T类型的参数，产出一个R类型的结果。
//        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "zhangsan").thenApply(name -> "hello " + name);
//        String s = future.get();
//        System.out.println("s = " + s);

        //thenAccept() 和 thenRun() 如果你不想从你的回调函数中返回任何东西，仅仅想在Future完成后运行一些代码片段
        // ，你可以使用thenAccept()和 thenRun()方法，这些方法经常在调用链的最末端的最后一个回调函数中使用。
        // CompletableFuture.thenAccept()持有一个Consumer<T>，返回一个CompletableFuture<Void>。它可以访问CompletableFuture的结果：
//        String tt = "";
//        CompletableFuture<Void> future = CompletableFuture.supplyAsync(() -> tt).thenApply((name) -> "hello " + name).thenAccept((tmp) -> tmp = "hello");
//        future.get();
//        System.out.println("tt = " + tt);
//
//        CompletableFuture.supplyAsync(() -> {
//            // Run some computation
//        }).thenRun(() -> {
//            // Computation Finished.
//        });

        //在thenApply()中的任务和在supplyAsync()中的任务执行在相同的线程中。任何supplyAsync()立即执行完成,那就是执行在主线程中（尝试删除sleep测试下）
        //如果你使用thenApplyAsync()回调，将从ForkJoinPool.commonPool()获取不同的线程执行。
//        CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(() -> {
//            System.out.println("NAME Thread.currentThread().getName() = " + Thread.currentThread().getName());
//            return "zhansan";
//        }).thenApply((name) -> {
//            System.out.println(" APP Thread.currentThread().getName() = " + Thread.currentThread().getName());
//            return "hello" + name;
//        });
//        stringCompletableFuture.get();

//        CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(() -> {
////            System.out.println("NAME Thread.currentThread().getName() = " + Thread.currentThread().getName());
////            return "zhansan";
////        }).thenApplyAsync((name) -> {
////            System.out.println(" APP Thread.currentThread().getName() = " + Thread.currentThread().getName());
////            return "hello" + name;
////        });
////
////        stringCompletableFuture.get();
//        ExecutorService workerServer = SingleExecutorService.getInstance().getWorkerServer();
//        CompletableFuture<Void> fu = CompletableFuture.runAsync(() -> {
//            try {
//                TimeUnit.SECONDS.sleep(1);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("aaa Thread.currentThread().getName() = " + Thread.currentThread().getName());
//        })
//                .thenAcceptAsync((name) -> System.out.println("bbb Thread.currentThread().getName() = " + Thread.currentThread().getName()),workerServer)
//                .thenRun(() -> System.out.println("ccc Thread.currentThread().getName() = " + Thread.currentThread().getName()))
//                .thenRun(() -> System.out.println("ddd Thread.currentThread().getName() = " + Thread.currentThread().getName()))
//                .thenRun(() -> System.out.println("eee Thread.currentThread().getName() = " + Thread.currentThread().getName()))
//                .thenRun(() -> System.out.println("fff Thread.currentThread().getName() = " + Thread.currentThread().getName()))
//                .thenRun(() -> System.out.println("hhh Thread.currentThread().getName() = " + Thread.currentThread().getName()));
//
//        fu.get();
//        System.out.println("Thread.currentThread().getName() = " + Thread.currentThread().getName());

//        thenCompose() 规则就是-如果你的回调函数返回一个CompletableFuture，但是你想从CompletableFuture链中获取一个直接合并后的结果，这时候你可以使用thenCompose()。

        //。thenCombine()被用来当两个独立的Future都完成的时候，用来做一些事情。  当两个Future都完成的时候，传给``thenCombine()的回调函数将被调用。

        System.out.println("Retrieving weight.");
        CompletableFuture<Double> weightInKgFuture = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("aaa Thread.currentThread().getName() = " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return 65.0;
        });

        System.out.println("Retrieving height.");
        CompletableFuture<Double> heightInCmFuture = CompletableFuture.supplyAsync(() -> {
            try {
                System.out.println("bbb Thread.currentThread().getName() = " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return 177.8;
        });

        System.out.println("Calculating BMI.");
        CompletableFuture<Double> combinedFuture = weightInKgFuture
                .thenCombine(heightInCmFuture, (weightInKg, heightInCm) -> {
                    System.out.println("ccc Thread.currentThread().getName() = " + Thread.currentThread().getName());
                    Double heightInMeter = heightInCm / 100;
                    return weightInKg / (heightInMeter * heightInMeter);
                });

        System.out.println("Your BMI is - " + combinedFuture.get());


        //我们可以使用以下两个方法组合任意数量的CompletableFuture。
        //static CompletableFuture<Void> allOf(CompletableFuture<?>... cfs)
        //static CompletableFuture<Object> anyOf(CompletableFuture<?>... cfs)

        List<String> webPageLinks = Arrays.asList();  // A list of 100 web page links

// Download contents of all the web pages asynchronously
        List<CompletableFuture<String>> pageContentFutures = webPageLinks.stream()
                .map(webPageLink -> downloadWebPage(webPageLink))
                .collect(Collectors.toList());


// Create a combined Future using allOf()
        CompletableFuture<Void> allFutures = CompletableFuture.allOf(
                pageContentFutures.toArray(new CompletableFuture[pageContentFutures.size()])
        );
        CompletableFuture<List<String>> allPageContentsFuture = allFutures.thenApply(v -> {
            return pageContentFutures.stream()
                    .map(pageContentFuture -> pageContentFuture.join())
                    .collect(Collectors.toList());
        });
        //join()方法和get()方法非常类似，这唯一不同的地方是如果最顶层的CompletableFuture完成的时候发生了异常，它会抛出一个未经检查的异常
        // Count the number of web pages having the "CompletableFuture" keyword.
        CompletableFuture<Long> countFuture = allPageContentsFuture.thenApply(pageContents -> {
            return pageContents.stream()
                    .filter(pageContent -> pageContent.contains("CompletableFuture"))
                    .count();
        });

        System.out.println("Number of Web Pages having CompletableFuture keyword - " +
                countFuture.get());


        //CompletableFuture.anyOf()和其名字介绍的一样，当任何一个CompletableFuture完成的时候【相同的结果类型】，返回一个新的CompletableFuture。以下示例：
        //


        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Result of Future 1";
        });

        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Result of Future 2";
        });

        CompletableFuture<String> future3 = CompletableFuture.supplyAsync(() -> {
            try {
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Result of Future 3";
        });

        CompletableFuture<Object> anyOfFuture = CompletableFuture.anyOf(future1, future2, future3);

        System.out.println(anyOfFuture.get()); // Result of Future 2



    }

    static CompletableFuture<String> downloadWebPage(String pageLink) {
        return CompletableFuture.supplyAsync(() -> {
            // Code to download and return the web page's content
            return "S";
        });
    }

}
