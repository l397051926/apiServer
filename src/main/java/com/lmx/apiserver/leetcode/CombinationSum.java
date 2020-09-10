package com.lmx.apiserver.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: lmx
 * @create: 2020/9/9
 **/
public class CombinationSum {


    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result  = new ArrayList<>();
        tmp(candidates,target,new ArrayList<>(),result);
        return result;
    }
    public void tmp(int[] candidates, int target, List<Integer> list, List<List<Integer>> result){
        for (int i = 0; i < candidates.length; i++) {
            List<Integer> tmpList = new ArrayList<>(list);
            if (candidates[i] > target){
                return;
            }else if(candidates[i] == target){
                tmpList.add(candidates[i]);
                boolean b = isChongfu(tmpList,result);
                if (b){
                    result.add(tmpList);
                }
            }else {
                tmpList.add(candidates[i]);
                tmp(candidates,target - candidates[i],tmpList,result);
            }
        }
    }

    private boolean isChongfu(List<Integer> tmpList, List<List<Integer>> result) {
        String collect = tmpList.stream().map(String::valueOf).sorted().collect(Collectors.joining(","));
        for (int i = 0; i < result.size(); i++) {
            List<Integer> list = result.get(i);
            String collect1 = list.stream().map(String::valueOf).sorted().collect(Collectors.joining(","));
            if (collect.equals(collect1)){
                return false;
            }
        }
        return true;
    }
}
