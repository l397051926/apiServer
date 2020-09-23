package com.lmx.apiserver.mianshi;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 缓存器
 * set 保证 原子+ 唯一
 * get
 */
class MyCache {
    private Map<String, Object> map = new HashMap<>();
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    public void set(String key, Object value) {
        try {
            lock.writeLock().lock();
            System.out.println(Thread.currentThread().getName() + " 正在写数据....");
            map.put(key, value);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " 写入完成....");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.writeLock().unlock();
        }
    }

    public void get(String key) {
        try {
            lock.readLock().lock();
            System.out.println(Thread.currentThread().getName() + " 正在读数据....");
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread().getName() + " 读入完成...." + map.get(key));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.readLock().unlock();
        }
    }
}

/**
 * @author: lmx
 * @create: 2020/9/22
 * 读写锁演示 利用缓存机智
 **/
public class ReadWriteLockDemo {

    public static void main(String[] args) {
        MyCache myCache = new MyCache();

        for (int i = 0; i < 5; i++) {
            int finalI = i;
            new Thread(() -> {
                myCache.set(finalI +"", finalI +"");
            }, i+"").start();
        }
        for (int i = 0; i < 5; i++) {
            int finalI = i;
            new Thread(() -> {
                myCache.get(finalI +"");
            }, i+"").start();
        }
        try { TimeUnit.SECONDS.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }

    }

}
