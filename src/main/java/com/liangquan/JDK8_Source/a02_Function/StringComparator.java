package com.liangquan.JDK8_Source.a02_Function;


import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * @ClassName：Main1
 * @Author: liangquan
 * @Date: 2024/9/28 13:23
 * @Description: 排序比较例子
 */
public class StringComparator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("v", "d", "b", "w", "g", "j");

        // 写法一
//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String s1, String s2) {
//                return s1.compareTo(s2);
//            }
//        });
//        list.sort(Comparator.naturalOrder());
//        System.out.println("list = " + list);

        // 写法二
//        Collections.sort(list,(String o1, String o2) -> {
//            return o1.compareTo(o2);
//        });
//        System.out.println("list = " + list);

        // 写法三
//        Collections.sort(list,(o1, o2) -> o1.compareTo(o2));
//        System.out.println("list = " + list);

        // 写法四
//        Collections.sort(list, String::compareTo);
//        System.out.println("list = " + list);

        // 写法四
        list.sort(String::compareTo);
        System.out.println("list = " + list);


    }
}