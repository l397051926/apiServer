package com.lmx.apiserver.leetcode;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author: lmx
 * @create: 2020/8/28
 **/
public class Main {
    /**
     * 首先 wilte str 来找出 所有 # 和 $ 两边数字
     * 递归过程中 如果 开头是 # $ 直接结束
     * 递归过程中 如果是 非 int 类型 直接结束
     *
     * @param args
     */

    public static void main(String[] args) {
        String str = "12#20$20#30$30";
        String[] split = str.split("\\$");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < split.length; i = i + 2) {
            String s1 = split[i];
            int x = 0;
            int y = 0;
            if (isInt(s1)) {
                x = Integer.parseInt(s1);
            } else {
                String[] split1 = s1.split("#");
                for (int j = 0; j < split1.length - 1; j++) {
                    sb.append(split1[j]);
                    sb.append("#");
                }
                x = Integer.parseInt(split1[split1.length - 1]);

            }
            if(i+1 <split.length){
                String s2 = split[i + 1];
                if (isInt(s2)) {
                    y = Integer.parseInt(s2);
                } else {
                    String[] split1 = s2.split("#");
                    for (int j = 1; j < split1.length; j++) {
                        sb.append(split1[j]);
                        sb.append("#");
                    }
                    y = Integer.parseInt(split1[0]);
                }
                sb.append(xy2(x, y));
            }else {
                String s2 = split[i + 1];
                if (isInt(s2)) {
                    y = Integer.parseInt(s2);
                } else {
                    String[] split1 = s2.split("#");
                    for (int j = 1; j < split1.length; j++) {
                        sb.append(split1[j]);
                        sb.append("#");
                    }
                    y = Integer.parseInt(split1[0]);
                }
                sb.append(xy2(x, y));
            }

        }
        String s2 = sb.toString();
        Integer result = 0;
        for (int i = 0; i < s2.length(); i++) {
            String[] split1 = s2.split("#");
            if (i != 0) {
                result = xy1(result,Integer.valueOf(split1[i]));
            }else {
                result = Integer.valueOf(split1[i]);
            }
        }
        System.out.println("result = " + result);

    }

    public static void test() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List<Integer> list = new ArrayList<>();

        if (check(str)) {
            System.out.println("缺少操作数");
        }

        String[] split = str.split("#");
    }


    public static boolean check(String str) {
        return str.startsWith("#") || str.startsWith("$") || str.endsWith("#") || str.endsWith("$");
    }

    public static boolean isInt(String str) {
        try {
            Integer.valueOf(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static Integer xy1(Integer x, Integer y) {
        return 2 * x + 3 * y + 4;
    }

    public static Integer xy2(Integer x, Integer y) {
        return 3 * x + y + 2;
    }
}
