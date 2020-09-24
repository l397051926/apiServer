package com.lmx.apiserver.threads;

import java.util.concurrent.Future;

class Mythread2 implements Runnable {

    @Override
    public void run() {
        System.out.println("this is runnbale");
    }
}

/**
 * @author: lmx
 * @create: 2020/9/24
 **/
public class RunnableDemo {
//    public static void main(String[] args) {
//        Mythread2 mythread2 = new Mythread2();
//
//        new Thread(mythread2).start();
//
//    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(Runtime.getRuntime().freeMemory());

    }
}
