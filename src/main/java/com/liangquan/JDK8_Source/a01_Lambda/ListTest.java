package com.liangquan.JDK8_Source.a01_Lambda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

/**
 * @ClassName：ListTest
 * @Author: liangquan
 * @Date: 2024/9/27 18:28
 * @Description: Lambda表达式在 循环List 中的写法
 */
public class ListTest {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("i = " + i);
        }

        System.out.println("===============");

        for (Integer i : list) {
            System.out.println("i = " + i);
        }

        System.out.println("=======匿名内部类（函数式接口）========");

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("integer = " + integer);
            }
        });

        HashMap<Object, Object> objectObjectHashMap = new HashMap<>();

        System.out.println("===============");

        // method reference
        list.forEach(System.out::println);

        System.out.println("===============");

    }
}
