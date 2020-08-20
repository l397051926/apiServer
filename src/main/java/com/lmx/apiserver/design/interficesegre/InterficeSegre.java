package com.lmx.apiserver.design.interficesegre;

/**
 * @author: lmx
 * @create: 2020/8/18
 **/
public class InterficeSegre {

    /**
     * 接口屏蔽原则 ，就是引用接口最小实现单位，不要依赖出其他不需要的函数，造成代码的臃肿
     * 比如 Demo1 只需要接口 函数 1，2，3 的功能， Demo2 只需要接口 1，4，5 功能， 所以可以拆分接口，来实现最小实现功能
     * @param args
     */
    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
        demo1.operator1();
        demo1.operator2();
        demo1.operator3();

        Demo2 demo2 = new Demo2();
        demo2.operator1();
        demo2.operator4();
        demo2.operator5();
    }

}

interface A {

    void operator1();
}

interface B {
    void operator2();
    void operator3();
}

interface C {
    void operator4();
    void operator5();
}

class Demo1 implements B ,A {

    @Override
    public void operator1() {
        System.out.println("Demo1  implement operator1");
    }

    @Override
    public void operator2() {
        System.out.println("Demo1  implement operator2");
    }

    @Override
    public void operator3() {
        System.out.println("Demo1  implement operator3");
    }
}

class Demo2 implements C,A {

    @Override
    public void operator1() {
        System.out.println("Demo2  implement operator1");
    }

    @Override
    public void operator4() {
        System.out.println("Demo2  implement operator4");
    }

    @Override
    public void operator5() {
        System.out.println("Demo2  implement operator5");
    }
}
