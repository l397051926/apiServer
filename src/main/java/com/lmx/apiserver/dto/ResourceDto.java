package com.lmx.apiserver.dto;

import lombok.Data;

/**
 * @author: lmx
 * @create: 2020/5/18
 **/
@Data
public class ResourceDto {

    private String jobName;

    @Override
    public String toString() {
        return "ResourceDto{" +
                "name='" + jobName + '\'' +
                '}';
    }
}
