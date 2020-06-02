package com.lmx.apiserver.leetcode;

import javax.validation.constraints.Min;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author: lmx
 * @create: 2020/6/1
 **/
public class Convert {
    public static void main(String[] args) {
        String s = "ssdfs";
    }

    /**
     * 单列表 ，列表内容为字符串，有几行就多少 stringbuilder
     * 判定拐点 ，按位置插入
     * @param s
     * @param num
     * @return
     */
    public static String convertDemo(String s, int num){

        if(num ==1){
            return s;
        }
        List<StringBuilder> rows = new LinkedList<>();
        for (int i = 0; i < Math.min(num, s.length()); i++) {
            rows.add(new StringBuilder());
        }

        int row = 0;
        boolean flag = false;

        for (char c : s.toCharArray()){
            rows.get(row).append(c);
            if(row == 0 || row == num -1){
                flag = !flag;
            }
            row += flag ? 1 : -1;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder builder : rows){
            result.append(builder);
        }
        return result.toString();


    }


    /**
     * 官方答案
     * @param s
     * @param numRows
     * @return
     */
    public String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder());
        }

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) {
                goingDown = !goingDown;
            }
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) {
            ret.append(row);
        }
        return ret.toString();
    }


}
