package com.lmx.apiserver.leetcode;

/**
 * @author: lmx
 * @create: 2020/9/2
 **/
public class IntToRoman {

    public static void main(String[] args) {
        System.out.println(intToRoman(4));
    }

    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < values.length; i++) {

            while (values[i] <= num){
                sb.append(symbols[i]);
                num = num - values[i];
            }

        }
        return sb.toString();

    }

}
