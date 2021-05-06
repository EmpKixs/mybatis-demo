package com.kixs.mybatis;

import com.kixs.mybatis.dao.UserDao;
import com.kixs.mybatis.entity.UserEntity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * mybatis 简单测试
 *
 * @author wangbing
 * @version v1.0.0
 * @since 2021/3/8 16:15
 */
public class SimpleTest {

    public static void main(String[] args) throws IOException {
        // 1、读取配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 2、初始化mybatis，创建SqlSessionFactory类实例
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 3、创建Session实例
        SqlSession session = sqlSessionFactory.openSession();
        // UserEntity user1 = session.selectOne("com.kixs.mybatis.dao.UserDao.select", 1);
        // System.out.println(user1.toString());
        UserDao userDao = session.getMapper(UserDao.class);
        UserEntity user2 = userDao.select(2);
        System.out.println(user2.toString());

        Queue<UserEntity> userEntityQueue = new ArrayDeque<>(5);
        Stack<UserEntity> userEntityStack = new Stack<>();
    }
}
