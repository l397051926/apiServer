package com.lmx.apiserver.mianshi;

import java.util.concurrent.TimeUnit;

class HelloLock implements Runnable{

    private String lockA;
    private String lockB;

    public HelloLock(String lockA, String lockB) {
        this.lockA = lockA;
        this.lockB = lockB;
    }

    @Override
    public void run() {

        synchronized (lockA){
            System.out.println(Thread.currentThread().getName() + "获得锁" + lockA);
            try { TimeUnit.SECONDS.sleep(2); } catch (InterruptedException e) { e.printStackTrace(); }
            synchronized (lockB){
                System.out.println(Thread.currentThread().getName() + "尝试获得 锁" + lockB);
            }
        }

    }
}

/**
 * @author: lmx
 * @create: 2020/10/12
 **/
public class DealLoclDemo1 {


    public static void main(String[] args) {
        System.out.println("死锁演示----------------");
        String lockA = "lockA";
        String lockB = "lockB";
        new Thread(new HelloLock(lockA,lockB), "thread AAA").start();
        new Thread(new HelloLock(lockB,lockA), "thread BBB").start();
    }
}
