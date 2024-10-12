package com.liangquan.JDK8_Source.a01_Lambda.构造方法引用;

class Person {
    String name;

    public Person() {
        this.name = "默认名称";
    }

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "'}";
    }
}
