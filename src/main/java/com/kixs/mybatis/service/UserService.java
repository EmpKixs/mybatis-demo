package com.kixs.mybatis.service;

import com.kixs.mybatis.entity.UserEntity;

/**
 * (User)表服务接口
 *
 * @author wangbing
 * @version v1.0.0
 * @since 2021/3/8 16:04
 */
public interface UserService {

    /**
     * 根据指定ID查询用户信息
     *
     * @param id 用户ID
     * @return 用户信息
     */
    UserEntity select(Integer id);
}