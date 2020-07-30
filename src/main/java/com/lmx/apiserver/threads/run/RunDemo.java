package com.lmx.apiserver.threads.run;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * @author: lmx
 * @create: 2020/7/30
 **/
@Slf4j
public class RunDemo implements Runnable {

    private Integer id;

    public RunDemo(Integer id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            log.info("this is id :{}",id);
            TimeUnit.SECONDS.sleep(3);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
