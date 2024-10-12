package com.liangquan.JDK8_Source.a02_Function;

/**
 * @ClassName：Persion
 * @Author: liangquan
 * @Date: 2024/10/12 16:44
 * @Description: Persons类
 */
public class Persons {
    private String name;
    private int age;

    public Persons() {}
    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}

