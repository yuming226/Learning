package SpringIOC.Xiao.Demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="userDao")//相当于<bean id="userDao" class="SpringIOC.Xiao.Demo1.UserDao"/>
public class UserDaoImpl implements UserDao{
    /*
    注解方式：使用注解方式，可以没有set方法的。
    1.属性如果有set方法，需要将属性注入的注解添加到set方法。
    2.属性如果没有set方法，需要将属性注入的注解添加到属性上。
     */
    private String name;

    @Value("王东")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void save() {
        System.out.println("userDaoImpl保存成功！" + name);
    }
}
