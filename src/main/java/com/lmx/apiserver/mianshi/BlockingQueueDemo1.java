package com.lmx.apiserver.mianshi;


import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程操作资源类 多线程访问
 */
class MyIncrement {

    private Integer number = 0;
    private Lock lock = new ReentrantLock();
    Condition condition = lock.newCondition();

    public void addNum() {
        try {
            lock.lock();
            while (number != 0) {
                condition.await();
            }
            number++;
            System.out.println(Thread.currentThread().getName() + "添加number 成功 numer为" + number);
            condition.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public void subNum() {
        try {
            lock.lock();
            while (number == 0) {
                condition.await();
            }
            number--;
            System.out.println(Thread.currentThread().getName() + "减少number 成功 numer为 " + number);
            condition.signalAll();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }


}

/**
 * @author: lmx
 * @create: 2020/9/24
 **/
public class BlockingQueueDemo1 {


    public static void main(String[] args) {
        MyIncrement increment = new MyIncrement();
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                increment.addNum();
            }
        }, "AAA").start();

        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                increment.subNum();
            }
        }, "BBB").start();
    }
}
