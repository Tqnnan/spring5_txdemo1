package com.atguigu.spring5;

/**
 * @author 楠檀,
 * @date 2023/2/15,
 * @time 0:56,
 */
public class Book {
    //创建属性
    private String bname;
    private String bauthor;

    //创建属性对应的方法
    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBauthor(String bauthor) {
        this.bauthor = bauthor;
    }

    public void testDemo(){
        System.out.println(bname+"::"+bauthor);
    }
}
