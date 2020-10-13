package com.lmx.apiserver.mianshi;

import java.nio.ByteBuffer;

/**
 * @author: lmx
 * @create: 2020/10/13
 **/
public class DirectBufferMemoryDemo {

    public static void main(String[] args) {
        System.out.println("配置的maxDirectMemory:" + (sun.misc.VM.maxDirectMemory() / (double)1024/1024) + "MB");
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(6 *1024 * 1024);
    }
}
