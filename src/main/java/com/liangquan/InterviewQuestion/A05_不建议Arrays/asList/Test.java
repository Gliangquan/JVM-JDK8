package com.liangquan.InterviewQuestion.A05_不建议Arrays.asList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName：main
 * @Author: liangquan
 * @Date: 2024/10/26 15:17
 * @Description: 为什么不建议使用Arrays.asList()初始化List
 */
public class Test {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("list = " + list);


        List<Integer> list1 = Arrays.asList(1, 2);
//        代码在 list1.add(3); 这一行会抛出 UnsupportedOperationException 异常，
//        因为 Arrays.asList() 生成的 List 并不支持动态调整大小。
        list1.add(3);
        System.out.println("list1 = " + list1);

    }
}
