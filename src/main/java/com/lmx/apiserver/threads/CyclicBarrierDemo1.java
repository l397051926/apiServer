package com.lmx.apiserver.threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * @author: lmx
 * @create: 2021/4/19
 **/
public class CyclicBarrierDemo1 {

    private static final int NUMBER = 7;

    public static void main(String[] args)
    {
        //CyclicBarrier(int parties, Runnable barrierAction)

        CyclicBarrier cyclicBarrier = new CyclicBarrier(NUMBER, ()->{System.out.println("*****集齐7颗龙珠就可以召唤神龙");}) ;

        for (int i = 1; i <= 7; i++) {
            new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName()+"\t 星龙珠被收集 ");
                    cyclicBarrier.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }, String.valueOf(i)).start();
        }


    }

}
