package com.lmx.apiserver.leetcode;

import lombok.extern.slf4j.Slf4j;

import java.util.LinkedList;
import java.util.List;

/**
 * @author: lmx
 * @create: 2020/5/27
 **/
@Slf4j
public class AddTwoNumber {

    public static void main(String[] args) {
        Integer aNum = 99;
        Integer bNum = 564;

        List<Integer> a = getList(aNum);
        List<Integer> b = getList(bNum);


        List<Integer> list = addTwoNumber(a, b);
        list.forEach(System.out::println);
    }

    public static List<Integer> addTwoNumber(List<Integer> a , List<Integer> b){
        List<Integer> list = new LinkedList<>();
        boolean carry = false ;
        for (int i = 0; i < (a.size() > b.size() ? a.size() : b.size()); i++) {
            Integer aVal = i >= a.size() ? 0 : a.get(i);
            Integer bVal = i >= b.size() ? 0 : b.get(i);
            Integer condition = aVal + bVal;
            if(carry){
                list.add(condition % 10 +1);
                carry = false;
            }else {
                list.add(condition % 10);
            }
            if(condition / 10 > 0){
                carry = true;
            }
        }
        return list;
    }

    public static List<Integer> getList(Integer target){
        List<Integer> list = new LinkedList<>();
        while (target> 0){
            list.add(target % 10 );
            target = target / 10;
        }
        return list;
    }
}
