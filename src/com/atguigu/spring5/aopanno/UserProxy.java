package com.atguigu.spring5.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author 楠檀,
 * @date 2023/2/16,
 * @time 4:16,
 */

//增强的类
@Component
@Aspect
public class UserProxy {

    //前置通知
    @Before(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void before(){
        System.out.println("before.....");
    }

    //最终通知
    @After(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void after(){
        System.out.println("after....");
    }

    //后置通知（返回通知）
    @AfterReturning(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning....");
    }

    //异常通知
    @AfterThrowing(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing....");
    }

    //环绕通知
    @Around(value = "execution(* com.atguigu.spring5.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕之前....");

        //被增强方法执行
        proceedingJoinPoint.proceed();

        System.out.println("环绕之后....");
    }
}
