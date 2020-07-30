package com.lmx.apiserver.lambda;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: lmx
 * @create: 2020/6/27
 **/
public class ConditionDemo {
    public static void main(String[] args) {
        DemoTest demoTest = new DemoTest();
        new Thread(()->{
            try {
                for (int i = 0; i < 10; i++) {
                    demoTest.sys();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "aaa").start();
        new Thread(()->{
            try {
                for (int i = 0; i < 10; i++) {
                    demoTest.sys();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "bbb").start();
        new Thread(()->{
            try {
                for (int i = 0; i < 10; i++) {
                    demoTest.sys();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "cccc").start();
    }

}

class DemoTest{

    private  int number = 1;
    private Lock lock = new ReentrantLock();
    private Condition c1 = lock.newCondition();
    private Condition c2 = lock.newCondition();
    private Condition c3 = lock.newCondition();

    public void sys() throws InterruptedException {
        try {
            lock.lock();
            while ( number != 1){
                c1.await();
            }
            while ( number != 2){
                c2.await();
            }
            while ( number != 3){
                c3.await();
            }

            int i = number == 1 ? 5 : number == 2 ? 10 : 15;
            for (int j = 0; j < i; j++) {
                System.out.println( "number: " + number + " ----- " + j);
            }
            if(number == 1){
                c2.signalAll();
            }else if(number ==2 ){
                c3.signalAll();
            }else {
                c1.signalAll();
            }

        }finally {
            lock.unlock();
        }
    }

}
