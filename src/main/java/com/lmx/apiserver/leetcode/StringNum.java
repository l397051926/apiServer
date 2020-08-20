package com.lmx.apiserver.leetcode;

/**
 * @author: lmx
 * @create: 2020/8/17
 **/
public class StringNum {

    public static void main(String[] args) {
        String str = "hello world";
        String[] array = str.split(" ");
        System.out.println(array[array.length-1].length());
    }
}
