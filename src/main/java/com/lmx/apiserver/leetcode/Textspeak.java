package com.lmx.apiserver.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * @author: lmx
 * @create: 2020/8/30
 **/
public class Textspeak {
    /**
     * # $ 切割  统计
     * 12#23$13#33$2
     * $优先级 高于 #
     *
     * @param args
     */
    public static void main(String[] args) {
        String str = "12#20$20#30$30$12";
        String[] split = str.split("\\$");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            String s1 = split[i];
            if (isNumeric(s1)) {
                list.add(s1);
                if (i != split.length - 1) {
                    list.add("$");
                }
            } else {
                addjing(s1, list);
                if (i != split.length - 1) {
                    list.add("$");
                }
            }
        }
        //计算所有$ 值
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if ("$".equals(list.get(i))) {
                Integer integer = xy2(Integer.valueOf(list1.get(list1.size()-1)), Integer.valueOf(list.get(i + 1)));
                list1.remove(list1.size()-1);
                i++;
                list1.add(String.valueOf(integer));
            } else {
                list1.add(list.get(i));
            }
        }
        //去掉 # 计算
        Integer result = Integer.parseInt(list1.get(0));
        for (int i = 0; i < list1.size(); i++) {
            if("#".equals(list1.get(i))){
                result = xy1(result, Integer.parseInt(list1.get(i+1)));
            }
        }
        System.out.println("result: " +result);
    }

    public static void addjing(String str, List<String> list) {
        String[] split = str.split("#");
        for (int i = 0; i < split.length; i++) {
            String s = split[i];
            if (isNumeric(s)) {
                list.add(s);
                if (i != split.length - 1) {
                    list.add("#");
                }
            } else {
                throw new RuntimeException("is not a number");
            }
        }
    }

    public static boolean isNumeric(String str) {
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }

    public static Integer xy1(Integer x, Integer y) {
        return 2 * x + 3 * y + 4;
    }

    public static Integer xy2(Integer x, Integer y) {
        return 3 * x + y + 2;
    }
}
