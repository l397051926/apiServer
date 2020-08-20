package com.lmx.apiserver.design.inversion;

/**
 * @author: lmx
 * @create: 2020/8/18
 **/
public class DependencyPass {

    /**
     * 依赖倒置原则， 面向接口编程
     * @param args
     */
    public static void main(String[] args) {
        Persion persion = new Persion();
        persion.setIreversive(new Phone());
        persion.readMessage();
    }

}

interface Ireversive{
    String reversive();
}

class Phone implements Ireversive{

    @Override
    public String reversive() {
        return "手机返回信息";
    }
}

class Weixin implements Ireversive{

    @Override
    public String reversive() {
        return "微信返回信息....";
    }
}

/**
 * 第一种接口传递
 */
//class Persion{
//
//    public void readMessage(Ireversive ireversive){
//        ireversive.reversive();
//    }
//
//}

/**
 * 第二种构造方法传递
 */
//class Persion{
//    private Ireversive ireversive;
//    public void Persion(Ireversive ireversive){
//        this.ireversive = ireversive;
//    }
//    public void readMessage(){
//        ireversive.reversive();
//    }
//}

/**
 * 第三种 set方法传递
 */
class Persion{
    private Ireversive ireversive;

    public void readMessage(){
        System.out.println(ireversive.reversive());
    }

    public Ireversive getIreversive() {
        return ireversive;
    }

    public void setIreversive(Ireversive ireversive) {
        this.ireversive = ireversive;
    }
}
