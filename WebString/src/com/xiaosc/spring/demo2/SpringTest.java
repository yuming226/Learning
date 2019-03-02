package com.xiaosc.spring.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void demo() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerDao customerDao1 = (CustomerDao) applicationContext.getBean("customerDao");
        customerDao1.save();

        CustomerDao customerDao2 = (CustomerDao) applicationContext.getBean("customerDao");

        System.out.println(customerDao1 == customerDao2);
        applicationContext.close();
    }
}
