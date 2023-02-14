package com.atguigu.spring5.bean;

/**
 * @author 楠檀,
 * @date 2023/2/15,
 * @time 3:06,
 */
public class Emp {
    private String ename;
    private String gender;
    //员工属于某一个部门，使其对象形式表示
    private Dept dept;
    //方式二：生成dept的get方法
    public Dept getDept() {
        return dept;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void add(){
        System.out.println(ename+"::"+gender+"::"+dept);
    }
}
