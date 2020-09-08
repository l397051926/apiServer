package com.lmx.apiserver.leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author: lmx
 * @create: 2020/9/7
 **/
public class TopKFrequent {

    public static void main(String[] args) {
        topKFrequent(new int[]{1,1,1,2,2,3},2);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Tmp> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])){
                Tmp tmp = map.get(nums[i]);
                tmp.setSum(tmp.getSum() + 1);
            }else {
                map.put(nums[i],new Tmp(i,1));
            }
        }
        List<Tmp> collect = map.values().stream().sorted(Comparator.comparing(Tmp::getSum).reversed()).collect(Collectors.toList());
        int[] ints = new int[k];
        for (int i = 0; i < k; i++) {
            ints[i] = nums[collect.get(i).getIndex()];
        }
        return ints;
    }
}

class Tmp {
    private Integer index;
    private Integer sum;

    public Tmp(Integer index, Integer sum) {
        this.index = index;
        this.sum = sum;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public Integer getSum() {
        return sum;
    }

    public void setSum(Integer sum) {
        this.sum = sum;
    }
}
