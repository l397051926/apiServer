package com.lmx.nettyclientserver;

import com.lmx.nettyclientserver.service.NettyClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NettyClientServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(NettyClientServerApplication.class, args);
        //启动netty客户端
        NettyClient nettyClient = new NettyClient();
        nettyClient.start();

    }

}
