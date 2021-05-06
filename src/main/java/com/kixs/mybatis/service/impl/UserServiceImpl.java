package com.kixs.mybatis.service.impl;

import com.kixs.mybatis.dao.UserDao;
import com.kixs.mybatis.entity.UserEntity;
import com.kixs.mybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * (User)表服务实现类
 *
 * @author wangbing
 * @version v1.0.0
 * @since 2021/3/8 16:04
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public UserEntity select(Integer id) {
        return userDao.select(id);
    }
}