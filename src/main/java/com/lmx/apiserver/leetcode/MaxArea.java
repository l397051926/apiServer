package com.lmx.apiserver.leetcode;

/**
 * @author: lmx
 * @create: 2020/9/2
 **/
public class MaxArea {

    public static void main(String[] args) {
        System.out.println(maxArea1(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    public static int maxArea(int[] height) {

        int max = 0;

        for (int i = 0; i < height.length; i++) {

            for (int j = i + 1; j < height.length; j++) {
                int mianji = (j - i) * (Math.min(height[i], height[j]));
                max = Math.max(max, mianji);
            }
        }
        return max;
    }

    public static int maxArea1(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        while (l < r) {
            int tmpMax = (r - l) * Math.min(height[l],height[r]);
            if (height[l] < height[r]){
                l++;
            }else {
                r--;
            }
            max = Math.max(tmpMax,max);
        }

        return max;
    }
}
