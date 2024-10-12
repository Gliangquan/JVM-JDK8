package com.liangquan.JDK8_Source.a01_Lambda.函数式接口;

/**
 * @ClassName：FunctionInterficeTest
 * @Author: liangquan
 * @Date: 2024/9/27 18:52
 * @Description: 函数式接口
 */

/* *
1. 如果一个接口只有一个抽象方法，那么该接口就是一个函数式接口。
2. 如果我们在某个接口上声明了 FunctionalInterface 注解，那么编译器就会按照函数式接口的定义来要求该接口,
3. 如果某个接口只有一个抽象方法，但我们并没有给该接口声明 FunctionalInterface 注解，那么编译器依旧会将该接口看作是函数式接口。
 */

@FunctionalInterface
public interface FunctionInterfaceTest {
    // 只有一个抽象方法 （也不可以是一个方法的多个重写方法）
    void sayMessage(String message);

    // 如果一个接口声明了抽象方法，但是复写了Object类的方法，不会报错
    // FunctionInterfaceTest类 一定直接或者间接 的继承 Object类，已经有实现类了
    // 而 sayMessage 没有继承与其他类，没有其他实现
    String toString();
}
