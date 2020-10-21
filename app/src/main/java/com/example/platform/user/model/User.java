package com.example.platform.user.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@TableName("user")
@Data
public class User implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer Id;

    private String username;
    private String password;
}
