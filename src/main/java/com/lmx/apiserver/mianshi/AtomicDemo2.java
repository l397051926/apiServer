package com.lmx.apiserver.mianshi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.concurrent.atomic.AtomicReference;

/**
 * @author: lmx
 * @create: 2020/9/17
 **/
public class AtomicDemo2 {

    public static void main(String[] args) {
        User a = new User("aa", 12);
        User bb = new User("bb", 13);
        User c = new User("cc", 16);
        AtomicReference<User> atomicReference = new AtomicReference<>(a);
        System.out.println(atomicReference.compareAndSet(a, bb));
        System.out.println(atomicReference.compareAndSet(a, c));
        System.out.println(atomicReference.get());

    }

}

@Data
@ToString
@AllArgsConstructor
class User{
    private String name;
    private Integer age;
}
