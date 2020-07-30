package com.lmx.apiserver.threads.run;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.TimeUnit;

/**
 * @author: lmx
 * @create: 2020/7/30
 **/
@Slf4j
public class RunDemo2 {

    private Integer id;

    public RunDemo2(Integer id) {
        this.id = id;
    }

    public void execute() {
        try {
            log.info("the run demo 2 execute id is :{}", id);
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
