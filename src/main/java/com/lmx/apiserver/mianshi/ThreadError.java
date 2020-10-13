package com.lmx.apiserver.mianshi;

import java.util.concurrent.TimeUnit;

/**
 * @author: lmx
 * @create: 2020/10/13
 **/
public class ThreadError {

    public static void main(String[] args) {
        for (int i = 0; ; i++) {
            System.out.println(i);
            new Thread(()->{
                try { TimeUnit.SECONDS.sleep(Integer.MAX_VALUE); } catch (InterruptedException e) { e.printStackTrace(); }
            }).start();
        }


    }

}
