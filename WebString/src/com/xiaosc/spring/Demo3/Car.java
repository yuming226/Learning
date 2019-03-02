package com.xiaosc.spring.Demo3;

public class Car {

    private String name;
    private int price;

    public Car(String name,int price) {
        this.name = name;
        this.price = price;
    }

    public void save() {
        System.out.println("save创建成功!......." + "\t" + name + " " + price);
    }
}
