package com.powernode.spring6.dao;

import javax.xml.crypto.Data;

public class Dog {
    private String name;
    private Integer age;
    private Data birth;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirth(Data birth) {
        this.birth = birth;
    }


}
