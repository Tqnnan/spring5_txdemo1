package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 楠檀,
 * @date 2023/2/15,
 * @time 23:51,
 */
//在注解里面value属性值可以省略不写，默认值是类名称，首字母小写
//UserService -- userService
//@Component(value = "userService")//相当于<bean id="userService" class="..."/>
@Service
public class UserService {

    //定义dao类型属性
    //不需要添加set方法
    //添加注入属性注解
//    @Autowired//根据类型注入
//    @Qualifier(value = "userDaoImpl1")//根据名称注入

//    @Resource//根据类型注入
    @Resource(name = "userDaoImpl1")//根据名称注入
    private UserDao userDao;

    @Value(value = "abc")//注入普通类型属性
    public String name;
    public void add(){
        System.out.println("Service add........."+name);
        userDao.add();
    }
}
