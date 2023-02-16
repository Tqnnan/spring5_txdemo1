package com.atguigu.spring5.dao;

import com.atguigu.spring5.entity.Book;

import java.util.List;

/**
 * @author 楠檀,
 * @date 2023/2/16,
 * @time 6:07,
 */
public interface BookDao {
    //添加方法
    void add(Book book);

    void updateBook(Book book);

    void delete(String id);

    int selectCount();

    Book selectBook(String id);

    List<Book> selectAll();

    void batchAdd(List<Object[]> batchArgs);

    void batchUpdate(List<Object[]> batchArgs);

    void batchDelet(List<Object[]> batchArgs);
}
