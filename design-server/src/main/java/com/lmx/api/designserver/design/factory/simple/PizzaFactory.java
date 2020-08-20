package com.lmx.api.designserver.design.factory.simple;

import com.lmx.api.designserver.design.factory.simple.dto.BeefPizza;
import com.lmx.api.designserver.design.factory.simple.dto.CheesePizza;
import com.lmx.api.designserver.design.factory.simple.dto.Pizza;
import com.lmx.api.designserver.design.factory.simple.enums.PizzaType;
import lombok.extern.slf4j.Slf4j;

/**
 * @author: lmx
 * @create: 2020/8/20
 * 简单工厂模式 / 静态工厂模式 ，
 **/
@Slf4j
public class PizzaFactory {


    public static Pizza getPizzaInstance(PizzaType type){
        Pizza pizza = null;
        switch (type){
            case BEEF:{
                pizza = new BeefPizza();
                break;
            }
            case CHEESE:{
                pizza = new CheesePizza();
                break;
            }
            default:{
                log.error("未知类型");
            }
        }
        return pizza;
    }

}
