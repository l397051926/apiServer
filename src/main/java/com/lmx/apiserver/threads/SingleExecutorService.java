package com.lmx.apiserver.threads;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: lmx
 * @create: 2020/7/30
 **/
public class SingleExecutorService {

    private volatile static SingleExecutorService instance;

    private final ExecutorService workerServer = Executors.newFixedThreadPool(
            100,
            new ThreadFactoryBuilder()
                    .setDaemon(true)
                    .setNameFormat("worker")
                    .build());


    private SingleExecutorService() {
    }

    public static SingleExecutorService getInstance() {
        if (instance == null) {
            synchronized (SingleExecutorService.class) {
                if (instance == null) {
                    instance = new SingleExecutorService();
                }
            }
        }
        return instance;
    }

    public ExecutorService getWorkerServer() {
        return workerServer;
    }
}
