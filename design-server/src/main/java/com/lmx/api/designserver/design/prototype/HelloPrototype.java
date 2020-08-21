package com.lmx.api.designserver.design.prototype;

import com.lmx.api.designserver.design.prototype.dto.Sheep;
import com.lmx.api.designserver.design.prototype.dto.Wool;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

/**
 * @author: lmx
 * @create: 2020/8/21
 **/
public class HelloPrototype {

    /**
     * 原型模式 ，主要用于 通过一个已有的对象 进行clone  来实现 原型的扩展
     * conle 有两种形式 一个 是 深拷贝， 一个是浅拷贝
     * 深拷贝 java 提供两种方式
     * 1. 通过 Object clone 多层 clone 方式
     * 2. 通过 序列化和反序列化方式 进行 拷贝
     * 个人喜欢第三种方式 通过 已有的工具类进行拷贝 推荐使用 orika
     *
     * @param args
     */
    public static void main(String[] args) {
        Wool wool = new Wool();
        wool.setColor("黑色");
        Sheep sheep = new Sheep();
        sheep.setName("多礼");
        sheep.setWool(wool);

        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        MapperFacade mapper = mapperFactory.getMapperFacade();

        Sheep sh = mapper.map(sheep, Sheep.class);
        System.out.println("a");
        sh.setName("ddd");
        System.out.println();
    }

}
