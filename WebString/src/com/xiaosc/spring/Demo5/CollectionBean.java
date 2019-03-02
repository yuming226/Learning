package com.xiaosc.spring.Demo5;

import org.junit.Test;

import java.util.Arrays;

public class CollectionBean {
    String[] arrs;

    public void setArrs(String[] arrs) {
        this.arrs = arrs;
    }

    public String toString() {
        return "CollectionBean{" +
                "arrs=" + Arrays.toString(arrs) +
                '}';
    }

}
