package com.lmx.apiserver.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * @Description: 文件服务
 * @author: lmx
 * @date: 2021-07-12 3:35 下午
 */
@Service
@Slf4j
public class FileService {

    public String createResource(MultipartFile file) {
        if (file.isEmpty()) {
            log.error("file is empty: {}", file.getOriginalFilename());
            return "result";
        }
        return null;
    }
}
