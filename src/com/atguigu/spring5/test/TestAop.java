package com.atguigu.spring5.test;

import com.atguigu.spring5.aopanno.User;
import com.atguigu.spring5.aopxml.Book;
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

    @Test
    public void testAopXml(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book",Book.class);
        book.buy();
    }
}
