package com.lmx.apiserver.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lmx.apiserver.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: lmx
 * @create: 2020/5/28
 **/
public interface UserMapper extends BaseMapper<User> {

    List<User> querUserByName(@Param("userName") String userName);
}
