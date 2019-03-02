package com.xiaosc.spring.Demo3;

import com.xiaosc.spring.Demo3.Car;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {

    private Map<String, Car> map = new HashMap<>();

    public CarFactory() {
        map.put("xiao",new Car("123",123456));
        map.put("shi",new Car("456",456789));
    }

    public Car getCar(String brand) {
        return map.get(brand);
    }
}
