package com.lmx.apiserver.leetcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author: lmx
 * @create: 2020/5/27
 **/
public class LengthOfLongestSubstring {

    public static void main(String[] args) {
        System.out.println("------------lengthOfLongestSubstring---------------");
//        String s = "abcabcbb";
//        String s = "bbbbb";
        String s = "abcbdedb";
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(2,2);
        map.put(1,4);
        lengthOfLongestSubstring(s);
    }


    public static void lengthOfLongestSubstring(String str){
        Map<Character,Integer> map = new HashMap<>();
        List<Integer> list = new LinkedList<>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < str.length(); i++) {
            if(map.containsKey(str.charAt(i))){
                left = Math.max(left,map.get(str.charAt(i))+1);
            }
            map.put(str.charAt(i),i);
            max =  Math.max(max,i-left+1);
            list.add(max);
        }
        System.out.println(max);

    }

}
