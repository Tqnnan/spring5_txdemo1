package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.BookDao;
import com.atguigu.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 楠檀,
 * @date 2023/2/16,
 * @time 6:07,
 */

@Service
public class BookService {

    //注入dao
    @Autowired
    private BookDao bookDao;

    //添加的方法
    public void addBook(Book book){
        bookDao.add(book);
    }

    //修改的方法
    public void updateBook(Book book){
        bookDao.updateBook(book);
    }

    //删除
    public void delete(String id){
        bookDao.delete(id);
    }

    //查询表记录数
    public int  selectCount(){
        return bookDao.selectCount();
    }

    //查询返回对象
    public Book selectBook(String id){
        return bookDao.selectBook(id);
    }

    //查询返回集合
    public List<Book> selectAll(){
        return bookDao.selectAll();
    }

    //批量添加
    public void batchAdd(List<Object[]> batchArgs){
        bookDao.batchAdd(batchArgs);
    }

    //批量修改
    public void batchUpdate(List<Object[]> batchArgs){
        bookDao.batchUpdate(batchArgs);
    }

    //批量删除
    public void batchDelet(List<Object[]> batchArgs){
        bookDao.batchDelet(batchArgs);
    }
}
