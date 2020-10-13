package com.lmx.apiserver.mianshi;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lmx
 * @create: 2020/10/13
 **/
public class GCErrorDemo {

    public static void main(String[] args) {
        int i = 0;
        List<String> list = new ArrayList<>();
        try {
            while (true){
                list.add(String.valueOf(i++).intern());
            }
        } catch (Exception e) {
            System.out.println("**************i: " + i);
            e.printStackTrace();
            throw e;
        }
    }

}
