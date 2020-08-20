package com.lmx.apiserver.reflect;

/**
 * @author: lmx
 * @create: 2020/8/20
 **/
public class ReflectDemo {

    public static void main(String[] args) {
        try {
            Class.forName("com.lmx.apiserver.reflect.Cup").newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

}
