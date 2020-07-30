package com.lmx.apiserver.jus;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * @author: lmx
 * @create: 2020/7/9
 **/
@Slf4j
public class WorkExecutor {

    public static void main(String[] args) throws InterruptedException {
        final ExecutorService workerExecService;
        ThreadFactory threadFactory = new ThreadFactoryBuilder()
                .setDaemon(true)
                .setNameFormat("workersi")
                .build();
        workerExecService = Executors.newFixedThreadPool(50,threadFactory);
        for (int i = 0; i < 1000; i++) {
            workerExecService.submit(new RunTimeDemo(i));
        }
        System.out.println("end ...");
        while (true){

        }

    }
}
@Slf4j
class RunTimeDemo implements Runnable{

    private int id;

    public RunTimeDemo(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            log.info(Thread.currentThread().getName() +"   thread sss ssss id : " + id);
//            System.out.println("+----------" + id);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
