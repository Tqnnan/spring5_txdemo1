package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 楠檀,
 * @date 2023/2/16,
 * @time 19:15,
 */

@Service
@Transactional
//@Transactional这个注解
//添加到类上：指给这个类所以方法都添加事务
//添加到方法上，指为这个方法添加事务
public class UserService {

    @Autowired
    private UserDao userDao;

    public void accountMoney(){
        userDao.reduceMoney();

        //模拟异常
        int i = 10/0;

        userDao.addMoney();
    }
}
