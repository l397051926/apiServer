package com.lmx.apiserver.controller;

import com.lmx.apiserver.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lmx
 * @create: 2020/4/29
 **/
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Result hello(){
        return new Result(200,"成功");
    }

    @GetMapping("/sleep")
    public Result Sleep(
            @RequestParam Integer sleep
    ){
        try {
            Thread.sleep(sleep);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Result(200,"成功");
    }

}
