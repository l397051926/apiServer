package com.lmx.api.designserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lmx
 * @create: 2020/8/20
 **/
@RestController
@RequestMapping("/test")
public class VetryTest {


    @GetMapping
    public String hello(){
        return "hello world";
    }

}
