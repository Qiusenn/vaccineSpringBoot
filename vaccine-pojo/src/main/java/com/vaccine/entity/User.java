package com.vaccine.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    
    private int id;

    private String no;

    private String name;

    private String password;

    private int age;

    private int sex;

    private String phone;

    @TableField("role_id")
    private int roleId;

    @TableField("isValid")
    private String isvalid;
}
