package com.atguigu.spring5;

/**
 * @author 楠檀,
 * @date 2023/2/15,
 * @time 1:19,
 * 有参注入构造
 */
public class Orders {
    //属性
    private String oname;
    private String address;

    //有参构造
    public Orders(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void ordersTest() {
        System.out.println(oname+"::"+address);
    }
}
