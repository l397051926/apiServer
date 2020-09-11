package com.lmx.apiserver.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: lmx
 * @create: 2020/9/11
 **/
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        tmp(nums,target,0,result,new ArrayList<>(),new HashSet<String>());
        return result;
    }

    public void tmp(int[] nums, int target,int index, List<List<Integer>> result, List<Integer> list, HashSet<String> set){
        for (int i = index; i < nums.length; i++) {
            List<Integer> tmpList = new ArrayList<>(list);
            if (tmpList.size() >4){
                return;
            }
            if (nums[i] < target){
                tmpList.add(nums[i]);
                tmp(nums,target - nums[i],i+1,result,tmpList,set);
            }
            if (nums[i] == target ){
                tmpList.add(nums[i]);
                String str = tmpList.stream().map(String::valueOf).collect(Collectors.joining(","));
                if (tmpList.size() == 4 && !set.contains(str)){
                    result.add(tmpList);
                    set.add(str);
                }
                tmp(nums,target - nums[i],i+1,result,tmpList,set);
            }
        }
    }

}
