package com.kixs.mybatis.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author wangbing
 * @version v1.0.0
 * @since 2021/3/8 16:04
 */
@Data
public class UserEntity implements Serializable {
    private static final long serialVersionUID = -37127408415965077L;
    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 年龄
     */
    private Integer age;


}