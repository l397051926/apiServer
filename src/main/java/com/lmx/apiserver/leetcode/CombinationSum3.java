package com.lmx.apiserver.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lmx
 * @create: 2020/9/11
 **/
public class CombinationSum3 {

    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] ints = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        List<List<Integer>> result = new ArrayList<>();
        tmp(ints,result,0,k,n,new ArrayList());
        return result;
    }

    public void  tmp(int[] ints, List<List<Integer>> result, int index, int k, int target, List<Integer> list){
        for (int i = index; i < ints.length; i++) {
            List<Integer> tmpList = new ArrayList<>(list);
            if (tmpList.size() > k){
                return;
            }
            if (ints[i] == target){
                tmpList.add(ints[i]);
                if (k == tmpList.size()){
                    result.add(tmpList);
                }
                return;
            }else if (ints[i] < target){
                tmpList.add(ints[i]);
                tmp(ints, result, i+1,k,target - ints[i],tmpList);
            }else {
                return;
            }
        }
    }

}
