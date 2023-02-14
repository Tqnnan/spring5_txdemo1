package com.atguigu.spring5.bean;

/**
 * @author 楠檀,
 * @date 2023/2/15,
 * @time 3:05,
 */
public class Dept {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
