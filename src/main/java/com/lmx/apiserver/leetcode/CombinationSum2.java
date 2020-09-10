package com.lmx.apiserver.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author: lmx
 * @create: 2020/9/10
 **/
public class CombinationSum2 {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        tmp(candidates,target,0,new ArrayList<>(), result);
        return result;

    }

    public void tmp(int[] candidates, int target, int index, List<Integer> list, List<List<Integer>> result) {
        for (int i = index; i < candidates.length; i++) {
            List<Integer> tmp = new ArrayList<>(list);
            if (candidates[i] == target) {
                tmp.add(candidates[i]);
                if (isChongfu(tmp,result)){
                    result.add(tmp);
                }
            } else if (candidates[i] < target) {
                tmp.add(candidates[i]);
                tmp(candidates, target - candidates[i], i +1 , tmp, result);
            } else {
                return;
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
