package com.lmx.apiserver.lambda;

/**
 * @author: lmx
 * @create: 2020/6/26
 **/
public class Demo {

    public static void main(String[] args) {
        System.out.println("abc");
        Foo foo = ((x, y) -> x +y);
        System.out.println(foo.add(2,3));
        System.out.println(foo.mul());
        System.out.println(foo.call());
    }
}

@FunctionalInterface
interface Foo{
    int add (int x, int y);

    default int mul(){
     return 2;
    }
    default int call(){
        return 3;
    }

    public static int div(){
        return 5;
    }
}