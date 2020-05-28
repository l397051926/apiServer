package com.lmx.apiserver.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author: lmx
 * @create: 2020/5/18
 **/
@Data
public class Resource {

    private Integer id;
    private String name;
    private String url;
    private String httpMethod;
    @JSONField(jsonDirect = true)
    private String bodyParams;
    @JSONField(jsonDirect = true)
    private String headerParams;
    private String processType;

}
