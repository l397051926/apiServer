package com.lmx.apiserver.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: lmx
 * @create: 2020/5/28
 **/
@Data
@TableName("user")
public class User {
    @TableId(value="id", type= IdType.AUTO)
    private int id;
    private String userName;
    private Integer age;
}
