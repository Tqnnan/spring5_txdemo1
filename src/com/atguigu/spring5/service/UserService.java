package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 楠檀,
 * @date 2023/2/16,
 * @time 19:15,
 */

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public void accountMoney(){
        userDao.reduceMoney();

        userDao.addMoney();
    }
}
