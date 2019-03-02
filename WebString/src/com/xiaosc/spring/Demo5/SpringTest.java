package com.xiaosc.spring.Demo5;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.CookieHandler;

public class SpringTest {

    @Test
    public void demo() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CollectionBean collectionBean = (CollectionBean)applicationContext.getBean("applicationContext");
        System.out.println(collectionBean);
    }
}
