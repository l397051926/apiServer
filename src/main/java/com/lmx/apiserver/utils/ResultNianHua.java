package com.lmx.apiserver.utils;

import lombok.Data;

/**
 * @author: lmx
 * @create: 2020/4/29
 **/
@Data
public class ResultNianHua<T> {
    private Integer resultFlag;

    private String resultMsg ;

    private T bizData;

    public ResultNianHua(){}

    public ResultNianHua(Integer resultFlag, String resultMsg){
        this.resultFlag = resultFlag;
        this.resultMsg = resultMsg;
    }

    public ResultNianHua(Integer statusCode, String message, T bizData){
        this.resultFlag = statusCode;
        this.resultMsg = message;
        this.bizData = bizData;
    }



}
