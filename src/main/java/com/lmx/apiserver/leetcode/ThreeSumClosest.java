package com.lmx.apiserver.leetcode;

import java.util.Arrays;

/**
 * @author: lmx
 * @create: 2020/9/4
 **/
public class ThreeSumClosest {

    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{1,2,4,8,16,32,64,128},  82));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int n = nums.length;

        int res = 0;
        int tar = Integer.MAX_VALUE;
        for (int first = 0; first < n; first++) {

            int num1 = nums[first];

            for (int seconde = first + 1; seconde < n; seconde++) {
                int thread = n - 1;
                while (thread > seconde) {
                    int a = nums[seconde];
                    int b = nums[thread];
                    int tmp = num1 + nums[seconde] + nums[thread];
                    if (Math.max(tmp, target) - Math.min(tmp, target) < tar) {
                        tar = Math.max(tmp, target) - Math.min(tmp, target);
                        res = tmp;
                    }
                    --thread;
                }
            }

        }

        return res;
    }


}
