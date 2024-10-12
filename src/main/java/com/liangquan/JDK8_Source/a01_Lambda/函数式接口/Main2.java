package com.liangquan.JDK8_Source.a01_Lambda.函数式接口;

/**
 * @ClassName：Main
 * @Author: liangquan
 * @Date: 2024/9/27 18:57
 * @Description: 函数式接口，使用匿名内部类和 Lambda 表达式
 */
public class Main {
    public static void main(String[] args) {

        // 1. 匿名内部类 的方式创建
        FunctionInterfaceTest functionInterfaceTest1 = new FunctionInterfaceTest() {
            @Override
            public void sayMessage(String message) {
                System.out.println("Message1: " + message);
            }
        };

        // 2. 使用Lambda表达式实现函数式接口
        FunctionInterfaceTest functionInterfaceTest2 = (message) -> System.out.println("Message2: " + message);

        // 调用sayMessage方法
        functionInterfaceTest1.sayMessage("Hello, Java 8!");
        functionInterfaceTest2.sayMessage("Hello, Java 8!");
    }
}
