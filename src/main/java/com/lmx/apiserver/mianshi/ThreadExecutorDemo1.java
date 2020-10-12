package com.lmx.apiserver.mianshi;

import java.util.concurrent.*;

/**
 * @author: lmx
 * @create: 2020/10/12
 **/
public class ThreadExecutorDemo1 {

    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(2,
                5,
                1L,
                TimeUnit.SECONDS,
                new LinkedBlockingQueue<Runnable>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy());
    }

}
