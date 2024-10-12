package com.liangquan.JDK8_Source.a01_Lambda.函数式接口;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName：Main5_线程
 * @Author: liangquan
 * @Date: 2024/9/28 11:27
 * @Description: ListForeach
 */
public class Main6_ListForEach {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hallo", "world", "liang", "quan");

        list.forEach(item -> {
            System.out.println(item.toUpperCase());
        });

        ArrayList<String> listString = new ArrayList<>();
        list.forEach(item -> listString.add(item.toUpperCase()));
        System.out.println("listString = " + listString);

    }
}
