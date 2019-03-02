package com.xiaosc.spring.Demo4;

public class Car {
    private String name;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    /*public Car(String name, Double price) {
        this.name = name;
        this.price = price;
    }*/

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", prce=" + price +
                '}';
    }
}
