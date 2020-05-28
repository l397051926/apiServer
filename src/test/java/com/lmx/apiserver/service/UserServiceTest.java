package com.lmx.apiserver.service;

import com.lmx.apiserver.entity.User;
import com.lmx.apiserver.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: lmx
 * @create: 2020/5/28
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void test(){
        System.out.println("hello test");
    }

    @Test
    public void getUsers(){
        User user = userMapper.selectById(1);
        System.out.println();
    }

}
