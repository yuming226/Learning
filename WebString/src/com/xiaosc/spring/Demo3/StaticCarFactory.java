package com.xiaosc.spring.Demo3;

import java.util.HashMap;

public class StaticCarFactory {

   static HashMap<String,Car> hm = new HashMap<>();
    int b ;
    static {
        hm.put("xiao",new Car("123",12345));
        hm.put("shi",new Car("456",456789));
    }

    public static Car getCar(String name) {
        return hm.get(name);
    }

}
