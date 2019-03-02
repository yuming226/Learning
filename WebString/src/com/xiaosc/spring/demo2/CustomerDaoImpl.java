package com.xiaosc.spring.demo2;

public class CustomerDaoImpl implements CustomerDao {

    public void setUp() {
        System.out.println("CustomerDaoImpl类被初始化！");
    }
    @Override
    public void save() {
        System.out.println("CustomerDaoImpl中的save方法执行了。。。！");
    }

    public void destroy() {
        System.out.println("CustomerDaoImpl类被销毁！");
    }


}
