package com.lmx.apiserver.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author: lmx
 * @create: 2020/5/29
 **/
public class LongestPalindrome {


    public static void main(String[] args) {
        List<String> list = longTalindrome("cbbd");
        list.forEach(System.out :: println);
    }

    public static List<String> longTalindrome(String s){
        Map<Character, Integer> map = new HashMap<>();
        List<String> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(c)){
                list.add(s.substring(map.get(c),i+1));
            }
            map.put(c,i);
        }
        return list;
    }

    /**
     * 官方答案
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
}
