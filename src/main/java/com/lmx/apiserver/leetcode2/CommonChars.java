package com.lmx.apiserver.leetcode2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: lmx
 * @create: 2020/10/14
 **/
public class CommonChars {

    /**
     * 给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。
     * 例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。
     *
     * 你可以按任意顺序返回答案。

     * @return
     */
    public List<String> commonChars(String[] A) {
        List<String> result = new LinkedList<>();
        if (A.length < 1 ){
            return null;
        }
        if (A.length == 1){
            for (int i = 0; i < A[0].length(); i++) {
                result.add(String.valueOf(A[0].indexOf(i)));
            }
            return result;
        }
        for (int i = 0; i < A.length; i++) {
            if (A[i].trim().length() == 0 ){
                return null;
            }
        }
        String tmp = A[0];
        for (int i = 0; i < tmp.length(); i++) {

        }

        return null;
    }
}
