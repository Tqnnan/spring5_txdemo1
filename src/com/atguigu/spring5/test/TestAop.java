package com.atguigu.spring5.test;

import com.atguigu.spring5.aopanno.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 楠檀,
 * @date 2023/2/16,
 * @time 4:28,
 */
public class TestAop {

    @Test
    public void testAopAnno(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user",User.class);
        user.add();
    }
}
