package com.lmx.apiserver.threads;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author: lmx
 * @create: 2021/4/19
 **/
public class CyclicBarrierDemo {

    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("All are ready");
            }
        });
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            exec.execute(new TaskThread(barrier));
        }
        exec.shutdown();
    }

    static class TaskThread implements Runnable {

        private CyclicBarrier barrier;

        public TaskThread(CyclicBarrier barrier) {
            this.barrier = barrier;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is preparing");
            try {
                Thread.sleep(1000 + new Random().nextInt(1000));
                System.out.println(Thread.currentThread().getName() + " is ready");
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            try {
                Thread.sleep(1000 + new Random().nextInt(1000));
                System.out.println(Thread.currentThread().getName() + " is finished");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
