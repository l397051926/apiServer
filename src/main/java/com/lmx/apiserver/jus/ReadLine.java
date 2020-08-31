package com.lmx.apiserver.jus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author: lmx
 * @create: 2020/8/28
 **/
public class ReadLine {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        while ( (str = br.readLine()) != null){
            System.out.println(str);
        }
    }

}
