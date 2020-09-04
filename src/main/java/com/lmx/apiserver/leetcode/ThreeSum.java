package com.lmx.apiserver.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: lmx
 * @create: 2020/9/3
 **/
public class ThreeSum {

    public static void main(String[] args) {
        threeSum(new int[]{-13,5,13,12,-2,-11,-1,12,-3,0,-3,-7,-7,-5,-3,-15,-2,14,
                14,13,6,-11,-11,5,-15,-14,5,-5,-2,0,3,-8,-10,-7,11,-5,-10,-5,-7,-6,
                2,5,3,2,7,7,3,-10,-2,2,-12,-11,-1,14,10,-9,-15,-8,-7,-9,7,3,-2,5,11,
                -13,-15,8,-3,-7,-12,7,5,-2,-6,-3,-10,4,2,-5,14,-3,-1,-10,-3,-14,-4,
                -3,-7,-4,3,8,14,9,-2,10,11,-10,-4,-15,-9,-1,-1,3,4,1,8,1});

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        // 枚举 a
        for (int first = 0; first < n; ++first) {
            // 需要和上一次枚举的数不相同
            if (first > 0 && nums[first] == nums[first - 1]) {
                continue;
            }
            // c 对应的指针初始指向数组的最右端
            int third = n - 1;
            int target = -nums[first];
            // 枚举 b
            for (int second = first + 1; second < n; ++second) {
                // 需要和上一次枚举的数不相同
                if (second > first + 1 && nums[second] == nums[second - 1]) {
                    continue;
                }
                // 需要保证 b 的指针在 c 的指针的左侧
                while (second < third && nums[second] + nums[third] > target) {
                    --third;
                }
                // 如果指针重合，随着 b 后续的增加
                // 就不会有满足 a+b+c=0 并且 b<c 的 c 了，可以退出循环
                if (second == third) {
                    break;
                }
                if (nums[second] + nums[third] == target) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[first]);
                    list.add(nums[second]);
                    list.add(nums[third]);
                    ans.add(list);
                }
            }
        }
        return ans;
    }

    public static List<List<Integer>> threeSum1(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        add(nums, 0, new LinkedList<>(), result);
        return result;
    }

    public static void add(int[] nums, int index, List<Integer> list, List<List<Integer>> result) {
        for (int i = index; i < nums.length; i++) {
            List<Integer> tmpList = new LinkedList<>(list);
            tmpList.add(nums[i]);
            if (tmpList.size() < 3) {
                add(nums, i + 1, tmpList, result);
            } else {
                if (tmpList.stream().reduce((a, b) -> a + b).get() == 0 && checkTmpList(result, tmpList)) {
                    List<Integer> r = new LinkedList<>(tmpList);
                    result.add(r);
                }
                tmpList.remove(2);
            }
        }
    }

    private static boolean checkTmpList(List<List<Integer>> result, List<Integer> tmpList) {
        for (List<Integer> list : result) {
            boolean equals = list.stream().map(String::valueOf).sorted().collect(Collectors.joining()).
                    equals(tmpList.stream().map(String::valueOf).sorted().collect(Collectors.joining()));
            if (equals){
                return false;
            }
        }
        return true;
    }


}
