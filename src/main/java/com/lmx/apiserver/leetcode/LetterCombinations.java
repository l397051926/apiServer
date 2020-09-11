package com.lmx.apiserver.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: lmx
 * @create: 2020/9/10
 **/
public class LetterCombinations {

    static Map<Character,String[]> map = new HashMap<>();
    static {
        map.put('2',new String[]{"a","b","c"});
        map.put('3',new String[]{"d","e","f"});
        map.put('4',new String[]{"g","h","i"});
        map.put('5',new String[]{"j","k","l"});
        map.put('6',new String[]{"m","n","o"});
        map.put('7',new String[]{"p","q","r","s"});
        map.put('8',new String[]{"t","u","v"});
        map.put('9',new String[]{"w","x","y","z"});
    }


    public List<String> letterCombinations(String digits) {
        List<String[]> list = new ArrayList<>();
        List<String> result = new ArrayList<>();
        if (digits.length() ==0){
            return result;
        }


        for (int i = 0; i < digits.length(); i++) {
            list.add(map.get(digits.charAt(i)));
        }
        tmp(result,0,new StringBuffer(),list);
        return result;
    }
    public void tmp(List<String> result, int index, StringBuffer buffer, List<String[]> list){
        if (list.size() == index){
            result.add(buffer.toString());
        }else {
            for (int i = 0; i < list.get(index).length; i++) {
                buffer.append(list.get(index)[i]);
                tmp(result, index+1,buffer,list);
                buffer.deleteCharAt(index);
            }
        }
    }



}
