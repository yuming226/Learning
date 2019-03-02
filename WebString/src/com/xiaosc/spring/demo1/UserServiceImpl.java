package com.xiaosc.spring.demo1;

public class UserServiceImpl implements UserService {

    private String name;

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void save() {
        System.out.println("保存成功！" + name);
    }
}
