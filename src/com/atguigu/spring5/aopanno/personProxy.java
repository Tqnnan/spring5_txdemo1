package com.atguigu.spring5.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 楠檀,
 * @date 2023/2/16,
 * @time 4:47,
 */
@Component
@Aspect
@Order(3)
public class personProxy {

    //前置通知
    @Before(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void before(){
        System.out.println("person before.....");
    }
}
