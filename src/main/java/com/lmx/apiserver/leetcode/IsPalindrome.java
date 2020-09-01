package com.lmx.apiserver.leetcode;

/**
 * @author: lmx
 * @create: 2020/9/1
 **/
public class IsPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindorme(121));
        System.out.println(isPalindorme(11));
        System.out.println(isPalindorme(10));
        System.out.println(isPalindorme(-123));
        System.out.println(isPalindorme(12321));
    }

    public static boolean isPalindorme(int x){
        String s = String.valueOf(x);
        for (int i = 0; i < s.length()/2; i++) {
            if (!(s.charAt(i) == s.charAt(s.length()-1-i))){
                return false;
            }
        }
        return true;
    }

}
