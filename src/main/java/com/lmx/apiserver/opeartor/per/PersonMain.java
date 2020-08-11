package com.lmx.apiserver.opeartor.per;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: lmx
 * @create: 2020/8/11
 **/
public class PersonMain {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0: {
                    persons.add(new User());
                    break;
                }
                case 1: {
                    persons.add(new Student());
                    break;
                }
                case 2: {
                    persons.add(new Teacher());
                    break;
                }
                default:{
                    System.out.println("未知的参数");
                }
            }
        }

        persons.forEach(Person::executor);

    }

}
