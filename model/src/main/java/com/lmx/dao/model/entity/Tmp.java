package com.lmx.dao.model.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author: lmx
 * @create: 2020/10/22
 **/
@TableName("tmp")
@Data
public class Tmp {

    @TableId(value="id", type= IdType.AUTO)
    private Integer id;
    private String tmp;
}
