package com.lmx.apiserver.controller;

import com.lmx.apiserver.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Description: 文件服务
 * @author: lmx
 * @date: 2021-07-12 3:31 下午
 */
@RestController
public class FileController {

    @Autowired
    private FileService fileService;


    @PostMapping(value = "/upload")
    public String uploadResource(@RequestParam("file") MultipartFile file) {
        return fileService.createResource(file);
    }


}
