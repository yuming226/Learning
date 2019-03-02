package SpringIOC.Xiao.Demo2;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service("serviceDao")
public class ServiceDaoImpl implements ServiceDao {

    @PostConstruct //相当于init-method
    public void init() {
        System.out.println("service类被初始化");
    }

    public void save() {
        System.out.println("service类被保存");
    }

    @PreDestroy//相当于destroy-method
    public void destory() {
        System.out.println("service类被销毁");
    }
}
