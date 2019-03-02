package SpringIOC.Xiao.Demo2;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

    @Test
    public void demo() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        ServiceDao serviceDao = (ServiceDao) applicationContext.getBean("serviceDao");
        serviceDao.save();
    }
}
