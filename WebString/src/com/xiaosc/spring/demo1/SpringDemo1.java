package com.xiaosc.spring.demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo1 {

    @Test
    /**
     * 传统方式的调用
     */
    public void demo1() {
        UserService userService = new UserServiceImpl();
        userService.save();
    }

    @Test
    /**
     * Spring的方式的调用
     */
    public void demo2() {
        //创建Spring的工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userDao");
        userService.save();

    }

}
