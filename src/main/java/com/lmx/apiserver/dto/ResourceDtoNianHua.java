package com.lmx.apiserver.dto;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * @author: lmx
 * @create: 2020/5/22
 **/
@Data
public class ResourceDtoNianHua {
    @JSONField(jsonDirect = true)
    JSONObject pubParam;
    @JSONField(jsonDirect = true)
    JSONObject busiParam;

    @Override
    public String toString() {
        return "ResourceDtoNianHua{" +
                "pubParam='" + pubParam + '\'' +
                ", busiParam='" + busiParam + '\'' +
                '}';
    }
}
