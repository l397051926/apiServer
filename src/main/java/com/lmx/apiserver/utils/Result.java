package com.lmx.apiserver.utils;

import lombok.Data;

/**
 * @author: lmx
 * @create: 2020/4/29
 **/
@Data
public class Result<T> {
    private Integer statusCode;

    private String message ;

    private T data;

    public Result(){}

    public Result(Integer statusCode, String message){
        this.statusCode = statusCode;
        this.message = message;
    }

    public Result(Integer statusCode, String message, T data){
        this.statusCode = statusCode;
        this.message = message;
        this.data = data;
    }



}
