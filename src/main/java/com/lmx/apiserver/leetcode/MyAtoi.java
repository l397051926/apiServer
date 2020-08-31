package com.lmx.apiserver.leetcode;

import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: lmx
 * @create: 2020/6/16
 **/
public class MyAtoi {
    /**
     * 请你来实现一个 atoi 函数，使其能将字符串转换成整数。
     * <p>
     * 首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。接下来的转化规则如下：
     * <p>
     * 如果第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字字符组合起来，形成一个有符号整数。
     * 假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成一个整数。
     * 该字符串在有效的整数部分之后也可能会存在多余的字符，那么这些字符可以被忽略，它们对函数不应该造成影响。
     * 注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换，即无法进行有效转换。
     * <p>
     * 在任何情况下，若函数不能进行有效的转换时，请返回 0 。
     * <p>
     * 提示：
     * <p>
     * 本题中的空白字符只包括空格字符 ' ' 。
     * 假设我们的环境只能存储 32 位大小的有符号整数，那么其数值范围为 [−231,  231 − 1]。如果数值超过这个范围，请返回  INT_MAX (231 − 1) 或 INT_MIN (−231) 。
     */
    public static void main(String[] args) {
        System.out.println(test("-2147483647"));

    }

    public static Integer test(String str) {
        String trim = str.trim();

        if(trim.length()>1){
            StringBuffer sb = new StringBuffer();
            if ('-' == trim.charAt(0) || '+' == trim.charAt(0) || isInt(trim.charAt(0))) {
                sb.append(trim.charAt(0));
            } else {
                return 0;
            }
            for (int i = 1; i < trim.length(); i++) {
                if(i ==1){
                    if (isInt(trim.charAt(i))) {
                        sb.append(trim.charAt(i));
                    } else {
                        if(isInt(trim.charAt(0))){
                            break;
                        }else{
                            return 0;
                        }
                    }
                }else {
                    if (isInt(trim.charAt(i))) {
                        int number = Integer.parseInt(sb.toString());
                        if (number  > Integer.MAX_VALUE / 10 || (number == Integer.MAX_VALUE/10 && Integer.valueOf(String.valueOf(trim.charAt(i)))>7 ) ) {
                            return Integer.MAX_VALUE;
                        } else if (number < Integer.MIN_VALUE /10 || (number == Integer.MIN_VALUE/10 && -Integer.valueOf(String.valueOf(trim.charAt(i)))<-8 ) ) {
                            return Integer.MIN_VALUE;
                        }
                        sb.append(trim.charAt(i));
                    } else {
                        break;
                    }
                }


            }

            return Integer.parseInt(sb.toString());
        }else if(trim.length() == 1){
            if (isInt(trim.charAt(0))){
                return  Integer.valueOf(trim);
            }else {
                return 0;
            }
        }else {
            return 0;
        }


    }

    public static boolean isInt(Character str) {
        boolean digit = Character.isDigit(str);
        return digit;
    }

    /**
     * 最优解是 正则
     * @param str
     * @return
     */
    public int myAtoi(String str) {
        String pattern = "^\\s*([+-]?\\d+)";
        Pattern r = Pattern.compile(pattern);

        Matcher m = r.matcher(str);
        if (!m.find( )) {
            return 0;
        }

        BigInteger ans = new BigInteger(m.group(1));
        if(ans.compareTo(new BigInteger(String.valueOf(Integer.MIN_VALUE)))<0){
            return Integer.MIN_VALUE;
        }
        if(ans.compareTo(new BigInteger(String.valueOf(Integer.MAX_VALUE)))>0){
            return Integer.MAX_VALUE;
        }
        return ans.intValue();

    }

}
