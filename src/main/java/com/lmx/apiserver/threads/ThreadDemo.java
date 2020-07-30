package com.lmx.apiserver.threads;

import com.lmx.apiserver.threads.run.RunDemo;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * @author: lmx
 * @create: 2020/7/29
 **/
@Slf4j
public class ThreadDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService workerServer = SingleExecutorService.getInstance().getWorkerServer();
        List<Future> futures = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            futures.add(workerServer.submit(new RunDemo(i)));
        }

        for (Future future : futures){
            future.get();
        }
        log.info("this main is stop....");

    }

}
