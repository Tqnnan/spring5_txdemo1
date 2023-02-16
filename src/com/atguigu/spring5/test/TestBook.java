package com.atguigu.spring5.test;

import com.atguigu.spring5.entity.Book;
import com.atguigu.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 楠檀,
 * @date 2023/2/16,
 * @time 6:33,
 */
public class TestBook {

    @Test
    public void testJdbcTemplate(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService",BookService.class);

        //添加
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("java");
//        book.setUstatus("a");
//        bookService.addBook(book);

        //修改
//        Book book = new Book();
//        book.setUserId("1");
//        book.setUsername("mybatis");
//        book.setUstatus("abc");
//        bookService.updateBook(book);

//        bookService.delete("1");

        //查询某个值
//        int count = bookService.selectCount();
//        System.out.println(count);

        //查询返回对象
//        Book book = bookService.selectBook("1");
//        System.out.println(book);

        //查询返回集合
//        List<Book> books = bookService.selectAll();
//        System.out.println(books);

        //批量添加测试
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"3","ccc","c"};
//        Object[] o2 = {"4","ddd","d"};
//        Object[] o3 = {"5","eee","e"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        //调用批量添加
//        bookService.batchAdd(batchArgs);

        //批量修改
//        List<Object[]> batchArgs = new ArrayList<>();
//        Object[] o1 = {"ccc111","c11","3"};
//        Object[] o2 = {"ddd111","d22","4"};
//        Object[] o3 = {"eee333","e33","5"};
//        batchArgs.add(o1);
//        batchArgs.add(o2);
//        batchArgs.add(o3);
//        //调用批量添加
//        bookService.batchUpdate(batchArgs);

        //批量删除
        List<Object[]> batchArgs = new ArrayList<>();
        Object[] o1 = {"3"};
        Object[] o2 = {"4"};
        batchArgs.add(o1);
        batchArgs.add(o2);
        //调用批量添加
        bookService.batchDelet(batchArgs);
    }
}
