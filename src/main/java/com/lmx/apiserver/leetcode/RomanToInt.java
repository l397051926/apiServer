package com.lmx.apiserver.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: lmx
 * @create: 2020/9/3
 **/
public class RomanToInt {

    public static void main(String[] args) {
        System.out.println(romanToInt("IX"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int ants = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i + 1 < s.length()) {
                char cn = s.charAt(i + 1);
                if (map.get(c) < map.get(cn)) {
                    ants = ants + map.get(cn) - map.get(c);
                    i++;
                    continue;
                }
            }
            ants = ants + map.get(c);
        }
        return ants;
    }

}
