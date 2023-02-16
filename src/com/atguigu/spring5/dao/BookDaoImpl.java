package com.atguigu.spring5.dao;

import com.atguigu.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @author 楠檀,
 * @date 2023/2/16,
 * @time 6:07,
 */

@Repository
public class BookDaoImpl implements BookDao{

    //注入JdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Book book) {
        //1 创建sql语句
        String sql = "insert into t_book value(?,?,?)";
        //2 调用方法实现
        Object[] args = {book.getUserId(),book.getUsername(),book.getUstatus()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    @Override
    public void updateBook(Book book) {
        //1 创建sql语句
        String sql = "update t_book set username=?,ustatus=? where user_id=?";
        //2 调用方法实现
        Object[] args = {book.getUsername(),book.getUstatus(),book.getUserId()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    @Override
    public void delete(String id) {
        //1 创建sql语句
        String sql = "delete from t_book where user_id=?";
        //2 调用方法实现
        int update = jdbcTemplate.update(sql,id);
        System.out.println(update);
    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from t_book";

        //queryForObject方法中：第一个参数 sql语句，第二个参数 返回类型class
        Integer count = jdbcTemplate.queryForObject(sql,Integer.class);
        return count;
    }

    @Override
    public Book selectBook(String id) {
        String sql = "select * from t_book where user_id=?";
        //queryForObject方法中：
        // 第一个参数 sql语句
        // 第二个参数 RowMapper是接口，针对不同类型数据，使用这个接口里面实现类，实现数据封装
        // 第三个参数 sql语句值
        Book book = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Book>(Book.class),id);
        return book;
    }

    @Override
    public List<Book> selectAll() {
        String sql = "select * from t_book";
        //query方法中：
        // 第一个参数 sql语句
        // 第二个参数 RowMapper是接口，针对不同类型数据，使用这个接口里面实现类，实现数据封装
        // 第三个参数 sql语句值
        List<Book> books = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Book>(Book.class));
        return books;
    }

    @Override
    public void batchAdd(List<Object[]> batchArgs) {
        String sql = "insert into t_book value(?,?,?)";
        //batchUpdate方法：第一个参数 sql语句，第二个参数：List集合，添加多条记录数据
        int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchUpdate(List<Object[]> batchArgs) {
        String sql = "update t_book set username=?,ustatus=? where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchDelet(List<Object[]> batchArgs) {
        String sql = "delete from t_book where user_id=?";
        int[] ints = jdbcTemplate.batchUpdate(sql,batchArgs);
        System.out.println(Arrays.toString(ints));
    }
}
