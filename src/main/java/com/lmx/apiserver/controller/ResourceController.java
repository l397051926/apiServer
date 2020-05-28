package com.lmx.apiserver.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lmx.apiserver.dto.ResourceDto;
import com.lmx.apiserver.dto.ResourceDtoNianHua;
import com.lmx.apiserver.entity.Resource;
import com.lmx.apiserver.entity.ResourceNianHua;
import com.lmx.apiserver.utils.Result;
import com.lmx.apiserver.utils.ResultNianHua;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: lmx
 * @create: 2020/5/18
 **/
@RestController
public class ResourceController {

    private static final Logger logger = LoggerFactory.getLogger(ResourceController.class);

    @GetMapping("/queryJobList")
    public Result<JSON> getResource(){

        List<Resource> resources = new LinkedList<>();
        Resource resource = new Resource();
        resource.setId(1);
        resource.setName("task1");
        resource.setHttpMethod("GET");
        resource.setUrl("172.21.1.130:9303/execute");
        resource.setBodyParams(JSON.toJSONString(new JSONObject()));
        resource.setHeaderParams(JSON.toJSONString(new JSONObject()));
        resource.setProcessType("NIAN_HUA");

        Resource resource1 = new Resource();
        resource1.setId(2);
        resource1.setName("tmmmmm");
        resource1.setHttpMethod("POST");
        resource1.setUrl("172.21.1.130:9303/postExecute");
        JSONObject object = new JSONObject().fluentPut("name","zhangsan");
        resource1.setBodyParams(JSON.toJSONString(object));
        resource1.setHeaderParams(JSON.toJSONString(object));
        resource1.setProcessType("NIAN_HUA");

        resources.add(resource);
        resources.add(resource1);


        return new Result<>(200, "成功", JSONArray.parseArray(JSON.toJSONString(resources)));
    }

    @PostMapping("/sdap/intf/openapi/queryJobList")
    public ResultNianHua postResource(
            @RequestBody ResourceDtoNianHua resourceDto
            ){
        logger.info("this post resource dto :{}",resourceDto);
        List<ResourceNianHua> resources = new LinkedList<>();
        ResourceNianHua resource = new ResourceNianHua();
        resource.setJobId("id1");
        resource.setJobName("task1");

        ResourceNianHua resource1 = new ResourceNianHua();
        resource1.setJobId("id2");
        resource1.setJobName("task2");

        resources.add(resource);
        resources.add(resource1);

        JSONObject data = new JSONObject().fluentPut("jobList",resources);

        return new ResultNianHua<>(1,"成功", data);
    }

    @GetMapping("/execute")
    public Result execute(){
        return new Result(200,"get 执行成功");
    }

    @PostMapping("/sdap/intf/openapi/doStartJob")
    public ResultNianHua postExecute(
            @RequestBody ResourceDtoNianHua resourceDto
    ){
        logger.info("this post resource dto :{}",resourceDto);
        JSONObject data = new JSONObject().fluentPut("retCode",10000);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new ResultNianHua(1,"post 执行成功",data);
    }

    public static void main(String[] args) {
        JSONObject object = new JSONObject().fluentPut("id",1).fluentPut("name","zhangsan").fluentPut("age",13);
        Collection<Object> values = object.values();
        System.out.println();
    }

}


