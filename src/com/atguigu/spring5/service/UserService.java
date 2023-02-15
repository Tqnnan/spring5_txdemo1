package com.atguigu.spring5.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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

    public void add(){
        System.out.println("Service add.........");
    }
}
