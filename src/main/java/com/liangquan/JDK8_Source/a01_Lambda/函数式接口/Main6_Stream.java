package com.liangquan.JDK8_Source.a01_Lambda.函数式接口;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @ClassName：Main5_线程
 * @Author: liangquan
 * @Date: 2024/9/28 11:27
 * @Description: Stream流
 */
public class Main6_Stream {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hallo", "world", "liang", "quan");

        /* *
         * Stream 过滤
         * stream：一个线程
         * parallelStream：并行流
         */
        Stream<String> stringStream = list.stream().filter(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                if (s.equals("hallo")) {
                    return true;
                } else {
                    return false;
                }
            }
        });
        stringStream.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("s1 = " + s);
            }
        });

        // 简化
        Stream<String> stringStream2 = list.stream().filter((s) -> !s.equals("hallo"));
        stringStream2.forEach((s) -> System.out.println("s2 = " + s));

        // 再简化
        list.stream().filter((s) -> !s.equals("hallo"))
                .forEach((s) -> System.out.println("s3 = " + s));

        list.stream().map(item -> item.toUpperCase()).forEach(System.out::print);
        System.out.println();
        list.stream().map(String::toUpperCase).forEach(System.out::print);

    }
}
