package com.liangquan.JDK8_Source.a02_Function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @ClassName：Main1
 * @Author: liangquan
 * @Date: 2024/9/28 13:23
 * @Description: Function<T, R>
 *     T: 输入参数
 *     R: 返回参数
 */
public class Main1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3");

//        list.stream().map(item -> item.toUpperCase()).forEach(System.out::print);
//        System.out.println();
//        list.stream().map(String::toLowerCase).forEach(System.out::print);
//        System.out.println();

        /* *
         * toUpperCase 是没有接收参数的，只有一个返回 String
         * 使用类 String 加 :: 调用 toUpperCase，这里调用 toUpperCase 的就是 Function<String, String> 的第一个类型，返回是第二个类型
         */
        Function<String, String> function = String::toUpperCase;
        Consumer<String> consumer = System.out::print;

        list.stream().map(String::toLowerCase).forEach(System.out::print);
        list.stream().map(function).forEach(consumer);
        System.out.println("function.getClass().getInterfaces()[0] = " + function.getClass().getInterfaces()[0]);

    }
}
