package com.liangquan.JDK8_Source.a02_Function;

import java.util.function.Function;

/**
 * @ClassName：Aa01_FunctionTest01
 * @Author: liangquan
 * @Date: 2024/10/12 13:58
 * @Description: 高阶函数
 */
public class Aa01_FunctionTest01 {

    public static void main(String[] args) {

        Aa01_FunctionTest01 aa01_functionTest01 = new Aa01_FunctionTest01();

        // 传入的参数是一个函数
        System.out.println(aa01_functionTest01.compute(1, value -> value * 2));
        System.out.println(aa01_functionTest01.compute(2, value -> value + 5));
        System.out.println(aa01_functionTest01.convert(4, value -> "你好：" + value));

        // 返回值是一个函数
        System.out.println(aa01_functionTest01.returnFunction().apply(2));
    }


    public int compute(int a, Function<Integer, Integer> function) {
        return function.apply(a);
    }

    public String convert(int a, Function<Integer, String> function) {
        return function.apply(a);
    }

    // 写上面的例子就是对比以前的面相对象的方法，需要提前定义好方法的行为
    public int intAdd2(int a) {
        return a + 2;
    }

    public String intAddStr(int a, String b) {
        return a + b;
    }

    // 上面的函数，使用一个函数作为参数传递，或者返回值是一个函数的，都叫做高阶函数
    public Function<Integer, Integer> returnFunction() {
        return x -> x * 2;
    }
}
