package com.kixs.mybatis.controller;

import com.kixs.mybatis.entity.UserEntity;
import com.kixs.mybatis.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户接口
 *
 * @author wangbing
 * @version v1.0.0
 * @since 2021/3/18 14:37
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 根据指定ID查询用户信息
     *
     * @param id 用户ID
     * @return 用户信息
     */
    @GetMapping("{id}")
    public UserEntity select(@PathVariable("id") Integer id) {
        return userService.select(id);
    }
}
