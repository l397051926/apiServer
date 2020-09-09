package com.lmx.apiserver.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lmx
 * @create: 2020/9/8
 **/
public class Combine {

    public static void main(String[] args) {
        combine(4,2);
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        comb(1,n,k,new ArrayList<>(),result);
        return result;
    }

    public static void comb(int index, int n, int k, List<Integer> list, List<List<Integer>> result) {
        for (int i = index; i <= n; i++) {
            List<Integer> tmp = new ArrayList<>(list);
            if (list.size() < k -1) {
                tmp.add(i);
                comb(i + 1, n, k, tmp, result);
            } else {
                tmp.add(i);
                result.add(tmp);
                continue;
            }
        }
    }
}
