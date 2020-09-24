package com.lmx.apiserver.mianshi;

import java.util.concurrent.*;

/**
 * @author: lmx
 * @create: 2020/9/24
 **/
public class BlockQueue {

    public static void main(String[] args) {
        /**
         * 基于数组的blcking queue 有界限
         */
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
        /**
         * 基于链表的 blcking queue 有界限 默认是 Integer.MAX_VALUE
         */
        BlockingQueue<String> queue1 = new LinkedBlockingQueue<>();
        /**
         * 只有一个值的 blocking queue
         */
        BlockingQueue<String> queue2 = new SynchronousQueue<>();

        /**
         * 支持优先级的 blocking queue 无界限
         */
        BlockingQueue<String> queue3 = new PriorityBlockingQueue<>();

        /**
         * 支持优先级 填充的 blocking queue 无界限
         */
        new DelayQueue<>();

        /**
         * 基于链表的 无界限 queue
         */
        LinkedTransferQueue<Object> objects = new LinkedTransferQueue<>();

        /**
         * 基于链表的 双向队列
         */
        LinkedBlockingDeque<Object> objects1 = new LinkedBlockingDeque<>();

    }

}
