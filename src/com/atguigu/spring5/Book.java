package com.atguigu.spring5;

/**
 * @author 楠檀,
 * @date 2023/2/15,
 * @time 0:56,
 * 使用set注入
 */
public class Book {
    //创建属性
    private String bname;
    private String bauthor;
    private String address;

    //创建属性对应的方法
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void testDemo(){
        System.out.println(bname+"::"+bauthor+"::"+address);
    }
}
