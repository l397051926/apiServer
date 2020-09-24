package com.lmx.apiserver.mianshi;

import java.util.concurrent.*;

/**
 * @author: lmx
 * @create: 2020/9/24
 **/
public class ThreadExecutorPoolDemo1 {

    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
        ExecutorService executorService = new ThreadPoolExecutor(2,5,100L, TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>(3));

        for (int i = 0; i < 8; i++) {
            int finalI = i;
            executorService.submit(() -> {
                try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
                System.out.println(Thread.currentThread().getName() + " 消费的线程： " +finalI);

            });
        }
        executorService.shutdown();
        System.out.println("main 结束了");

    }

}
