package com.atguigu.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @author 楠檀,
 * @date 2023/2/16,
 * @time 0:24,
 */
@Repository(value = "userDaoImpl1")
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("dao add.....");
    }
}
