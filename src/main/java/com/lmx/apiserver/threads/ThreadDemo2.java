package com.lmx.apiserver.threads;

import com.lmx.apiserver.threads.run.RunDemo2;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * @author: lmx
 * @create: 2020/7/30
 **/
@Slf4j
public class ThreadDemo2 {


    public static void main(String[] args) {

        ExecutorService workerServer = SingleExecutorService.getInstance().getWorkerServer();

        List<Future> futures = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            int finalI = i;
            futures.add(workerServer.submit(() -> {
                new RunDemo2(finalI).execute();
            }));
        }

        for (Future future : futures){
            try {
                future.get();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        log.info("the thread demo 2 is end");



    }

}
