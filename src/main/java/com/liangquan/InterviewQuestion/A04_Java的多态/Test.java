package com.liangquan.InterviewQuestion.A04_Java的多态;

/**
 * @ClassName：Person
 * @Author: liangquan
 * @Date: 2024/10/17 11:12
 * @Description: 实现的功能？
 */
class Persons1 {
    void eat(){
        System.out.println("吃东西");
    }
}

// 抽象类
abstract class Persons2 {
    abstract void eat();

    // 普通方法
    void sleep() {
        System.out.println("休息");
    }
}

class Student extends Persons1{
    @Override
    void eat(){
        System.out.println("上学吃烤肠");
    }
}

class Worker extends Persons2 {
    @Override
    void eat() {
        System.out.println("上班吃外卖");
    }
}

public class Test{
    public static void main(String[] args) {
        Persons1 p1 = new Student();
        p1.eat();

        Persons2 p2 = new Worker();
        p2.eat();
    }
}