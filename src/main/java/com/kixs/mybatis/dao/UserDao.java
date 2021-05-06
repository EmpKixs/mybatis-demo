package com.kixs.mybatis.dao;

import com.kixs.mybatis.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (User)表数据库访问层
 *
 * @author wangbing
 * @version v1.0.0
 * @since 2021/3/8 16:04
 */
@Mapper
@Repository
public interface UserDao {

    /**
     * 通过实体作为筛选条件查询
     *
     * @param user 实例对象
     * @return 对象列表
     */
    List<UserEntity> queryAll(UserEntity user);

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 影响行数
     */
    int updateEntity(UserEntity user);

    /**
     * 根据指定ID查询用户信息
     *
     * @param id 用户ID
     * @return 用户信息
     */
    UserEntity select(@Param("id") Integer id);

}