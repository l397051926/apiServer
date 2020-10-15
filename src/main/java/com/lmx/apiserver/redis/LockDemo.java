package com.lmx.apiserver.redis;

import org.redisson.Redisson;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;

/**
 * @author: lmx
 * @create: 2020/10/14
 **/
public class LockDemo {

    public static void main(String[] args) {
        Config config = new Config();
        config.useSingleServer().setAddress("redis://127.0.0.1:6379");
        config.useSingleServer().setPassword("redis1234");

        final RedissonClient client = Redisson.create(config);
        RLock lock = client.getLock("lock1");

        try{
            lock.lock();
        }finally{
            lock.unlock();
        }
    }

}
