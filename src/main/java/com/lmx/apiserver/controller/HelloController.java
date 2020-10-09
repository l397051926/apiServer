package com.lmx.apiserver.controller;

import com.lmx.apiserver.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author: lmx
 * @create: 2020/4/29
 **/
@RestController
@Slf4j
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

    @PostMapping("/listPost")
    public Result listPost(@RequestBody List<Object> list){
        log.info("message:{}",list);
        return new Result(200,"sucess");
    }

    @PostMapping("/postTest")
    public Result postTest(@RequestBody Object list, HttpServletRequest request){
        log.info("message:{}",list);
        return new Result(200,"sucess");
    }


}
