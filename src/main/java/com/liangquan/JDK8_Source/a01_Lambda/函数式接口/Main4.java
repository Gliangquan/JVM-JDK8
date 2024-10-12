package com.liangquan.JDK8_Source.a01_Lambda.函数式接口;

/**
 * @ClassName：Main
 * @Author: liangquan
 * @Date: 2024/9/27 18:57
 * @Description: Lambda 函数式接口
 */

public class Main4{
    public static void main(String[] args){

        // Lambda 表达式 ，相当于匿名内部类
        // () -> {}

        // 需要上下文类型推断
        Main3FunctionInterfaceTest1 main3FunctionInterfaceTest1 = () -> {
            System.out.println("实现函数式接口：" + Thread.currentThread().getName());
        };
        main3FunctionInterfaceTest1.func1();
        main3FunctionInterfaceTest1.func2();

        Main3FunctionInterfaceTest2 main3FunctionInterfaceTest2 = () -> {};

    }
}

@FunctionalInterface
interface Main4unctionInterfaceTest1{
    void func1();

    default void func2(){
        System.out.println("default func2 = " + true);
    }
}


@FunctionalInterface
interface Main4FunctionInterfaceTest2{
    void func2();
}