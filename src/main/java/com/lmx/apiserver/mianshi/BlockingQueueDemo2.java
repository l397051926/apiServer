package com.lmx.apiserver.mianshi;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 消息队列 demo
 */
class MyResource {
    private boolean FLAG = true;
    private AtomicInteger integer = new AtomicInteger(0);
    private BlockingQueue<String> queue;

    public MyResource(BlockingQueue<String> queue) {
        this.queue = queue;
        System.out.println("使用的队列类型为: " + queue.getClass().getName());
    }

    public void add() throws InterruptedException {
        while (FLAG) {
            int i = integer.incrementAndGet();
            boolean offer = queue.offer(i + "", 1, TimeUnit.SECONDS);
            if (offer){
                System.out.println(Thread.currentThread().getName() + "向队列添加数据成功, 添加值为: " + i);
            }else {
                System.out.println(Thread.currentThread().getName() + "向队列添加数据失败, 添加值为: " + i);
            }
            try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }

        }
        System.out.println("消息队列已经被关闭了，停止向队列添加值");
    }

    public void consumer() throws InterruptedException {
        while (FLAG){
            String value = queue.poll(1, TimeUnit.SECONDS);
            if (value == null || value.equalsIgnoreCase("")){
                System.out.println(Thread.currentThread().getName() + "队列为空了， 停止消费");
                FLAG = false;
                return;
            }else {
                System.out.println(Thread.currentThread().getName() + "从队列消费数据成功, 消费值为: " + value);
            }
            try { TimeUnit.SECONDS.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }

        }
    }

    public void stop(){
        this.FLAG = false;
    }

}

/**
 * @author: lmx
 * @create: 2020/9/24
 **/
public class BlockingQueueDemo2 {

    public static void main(String[] args) {
        MyResource myResource = new MyResource(new ArrayBlockingQueue<>(10));
        new Thread(() -> {
            try {
                myResource.add();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "AAA").start();

        new Thread(() -> {
            try {
                myResource.consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "BBB").start();

        try { TimeUnit.SECONDS.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
        System.out.println("关闭消息队列");
        myResource.stop();

    }

}
