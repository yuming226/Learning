package SpringIOC.Xiao.Demo1;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDmeo {

    @Test
    public void dmeo() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao)applicationContext.getBean("userDao");
        userDao.save();
    }
}
