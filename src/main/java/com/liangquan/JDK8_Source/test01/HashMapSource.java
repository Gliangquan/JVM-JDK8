package com.liangquan.JDK8_Source.test01;

import java.util.HashMap;

/**
 * @ClassName：HashMapSource
 * @Author: liangquan
 * @Date: 2024/9/27 17:07
 * @Description: HashMap源码
 */
public class HashMapSource {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("a", 1);
        hashMap.put("b", 2);
        hashMap.put("c", 3);
        System.out.println("hashMap = " + hashMap);
    }
}
