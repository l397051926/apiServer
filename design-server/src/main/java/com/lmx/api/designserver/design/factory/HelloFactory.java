package com.lmx.api.designserver.design.factory;

import com.lmx.api.designserver.design.factory.simple.PizzaFactory;
import com.lmx.api.designserver.design.factory.simple.dto.Pizza;
import com.lmx.api.designserver.design.factory.simple.enums.PizzaType;

/**
 * @author: lmx
 * @create: 2020/8/20
 **/
public class HelloFactory {

    public static void main(String[] args) {
        sipleFactoryDemo();


    }



    /*---------------------------------------------------*/
    /**
     * 简单工厂模式 操作
     */
    public static void sipleFactoryDemo(){
        Pizza pizza = PizzaFactory.getPizzaInstance(PizzaType.BEEF);
        pizza.setName("牛市");
        runPizza(pizza);

        Pizza pizza1 = PizzaFactory.getPizzaInstance(PizzaType.CHEESE);
        pizza1.setName("肉丝");
        runPizza(pizza1);
    }

    public static void runPizza(Pizza pizza){
        pizza.production();
        pizza.bake();
        pizza.cut();
        pizza.pack();
    }
    /*---------------------------------------------------*/
}
