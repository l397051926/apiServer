package com.lmx.dao.model.controller;

import com.alibaba.fastjson.JSON;
import com.lmx.dao.model.dao.TmpMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lmx
 * @create: 2020/10/22
 **/
@RestController
public class HelloController {

    @Autowired
    private TmpMapper tmpMapper;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/tmp")
    public String tmp(){
        return JSON.toJSONString(tmpMapper.selectList(null));
    }

}
