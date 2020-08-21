package com.lmx.api.designserver.design.prototype.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author: lmx
 * @create: 2020/8/21
 * 羊毛
 **/
@Data
public class Wool implements Cloneable, Serializable {
    private static final long serialVersionUID = 1;

    private String color;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
