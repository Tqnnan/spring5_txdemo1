package com.atguigu.spring5.aopanno;

import org.springframework.stereotype.Component;

/**
 * @author 楠檀,
 * @date 2023/2/16,
 * @time 4:14,
 */

//被增强的类
@Component
public class User {
    public void add(){
        System.out.println("add.....");
    }
}
