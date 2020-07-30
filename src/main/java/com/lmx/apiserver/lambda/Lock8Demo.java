package com.lmx.apiserver.lambda;

import java.util.concurrent.TimeUnit;

/**
 * @author: lmx
 * @create: 2020/6/27
 **/
public class Lock8Demo {

    public static void main(String[] args) throws InterruptedException {
        Phone phone = new Phone();
        new Thread(()->{
            try {
                phone.sendMeail();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"A").start();
        Thread.sleep(300);
        new Thread(()->{
            phone.sendXml();
        },"B").start();
    }


}

class Phone{

    public synchronized void sendMeail() throws InterruptedException {
        TimeUnit.SECONDS.sleep(4);
        System.out.println("send mail");
    }

    public static synchronized void sendXml(){
        System.out.println("send xml...");
    }
}
