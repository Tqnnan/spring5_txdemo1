package com.atguigu.spring5.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author 楠檀,
 * @date 2023/2/16,
 * @time 20:52,
 */

@Configuration//配置类
@ComponentScan(basePackages = "com.atguigu")//组件扫描
@EnableTransactionManagement//开启事务
public class TxConfig {
    //创建数据库连接池
    @Bean
    public DruidDataSource getDruidDataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql:///user_db?serverTimezone=UTC");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("mysql");
        return druidDataSource;
    }

    //创建JdbcTemolate对象
    @Bean
    public JdbcTemplate jdbcTemplate(DruidDataSource druidDataSource){
        //到ioc容器中根据类型找到druidDataSource
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        //注入druidDataSource
        jdbcTemplate.setDataSource(druidDataSource);
        return jdbcTemplate;
    }

    //创建事务管理器
    @Bean
    public DataSourceTransactionManager getDataSourceTransactionManager(DruidDataSource druidDataSource){
        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
        transactionManager.setDataSource(druidDataSource);
        return transactionManager;
    }
}
