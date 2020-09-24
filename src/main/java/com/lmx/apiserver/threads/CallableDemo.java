package com.lmx.apiserver.threads;

import java.util.concurrent.*;

class MyThread implements Callable{

    @Override
    public Object call() throws Exception {
        System.out.println("caalllll");
        try { TimeUnit.SECONDS.sleep(3); } catch (InterruptedException e) { e.printStackTrace(); }
        return 1024;
    }
}

/**
 * @author: lmx
 * @create: 2020/9/24
 **/
public class CallableDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<Integer> futureTask = new FutureTask<>(new MyThread());
        new Thread(futureTask).start();
        System.out.println("result : " + futureTask.get());
    }

}
