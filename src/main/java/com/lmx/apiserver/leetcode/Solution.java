package com.lmx.apiserver.leetcode;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: lmx
 * @create: 2020/5/26
 **/
@Slf4j
public class Solution {


    public static void main(String[] args) {
        int[] array = new int[]{2, 7, 11, 15, 3 ,6, 7, 4, 5};
        int target = 9;
        solution(array,target);
    }


    public static void solution(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int condition = target - arr[i];
            if (map.containsKey(condition)) {
                log.info("this index {} ,value {} and index{}, value:{}", i, arr[i], map.get(condition), condition);
            }
            map.put(arr[i], i);
        }
    }
}
