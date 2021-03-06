package com.lmx.apiserver.leetcode2;

/**
 * @author: lmx
 * @create: 2021/3/9
 **/
public class RemoveDuplicates {
    /**
     *
     给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。

     在 S 上反复执行重复项删除操作，直到无法继续删除。

     在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
     */

    public String removeDuplicates(String S) {
        char[] s = S.toCharArray();
        int top = -1;
        for (int i = 0; i < S.length(); i++) {
            if (top == -1 || s[top] != s[i]) {
                s[++top] = s[i];
            } else {
                top--;
            }
        }
        return String.valueOf(s, 0, top + 1);
    }
}
