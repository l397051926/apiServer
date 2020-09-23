package com.lmx.apiserver.mianshi;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author: lmx
 * @create: 2020/9/22
 *
 * 互斥锁
 **/
public class SpinLockDemo {

    AtomicReference<Thread> threadAtomicReference = new AtomicReference<>();

    public void lock() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName() + "进入了线程....");
        while (!threadAtomicReference.compareAndSet(null, thread)) {

        }
    }

    public void unLock() {
        System.out.println(Thread.currentThread().getName() + "退出线程...");
        threadAtomicReference.compareAndSet(Thread.currentThread(), null);
    }

    public static void main(String[] args) {
        System.out.println("自旋锁 demo 演示");
        System.out.println("---------------------");
        SpinLockDemo spinLockDemo = new SpinLockDemo();

        new Thread(() -> {
            spinLockDemo.lock();
            try { TimeUnit.SECONDS.sleep(5); } catch (InterruptedException e) { e.printStackTrace(); }
            spinLockDemo.unLock();
        }, "AAA").start();

        new Thread(() -> {
            spinLockDemo.lock();
            try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
            spinLockDemo.unLock();
        },"BBB").start();

    }

}
