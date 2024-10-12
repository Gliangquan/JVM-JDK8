package com.liangquan.JDK8_Source.a02_Function;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @ClassName：a02_BiFunctionTest
 * @Author: liangquan
 * @Date: 2024/10/12 15:53
 * @Description: 如果Function要传递两个参数呢，可以使用BiFunction
 */
public class Ab01_BiFunctionTest {

    public static void main(String[] args) {
        Ab01_BiFunctionTest aa02BiFunctionTest = new Ab01_BiFunctionTest();

        int a = 3;
        int b = 5;

        System.out.println(aa02BiFunctionTest.biFunc(a, b, Integer::sum));
        System.out.println(aa02BiFunctionTest.biFunc(a, b, (x, y) -> x - y));
        System.out.println(aa02BiFunctionTest.biFunc(a, b, (x, y) -> x * y));
        System.out.println(aa02BiFunctionTest.biFunc(a, b, (x, y) -> x / y));
        System.out.println(aa02BiFunctionTest.biFunc(a, b, (x, y) -> x % y));

        int num = aa02BiFunctionTest.biFuncAndThen(9, 5, (x, y) -> x - y, x -> x * x);
        System.out.println("num = " + num);
    }

    public int biFunc(int a, int b, BiFunction<Integer, Integer, Integer> biFunc) {
        return biFunc.apply(a, b);
    }

    public int biFuncAndThen(int a, int b, BiFunction<Integer, Integer, Integer> f1, Function<Integer, Integer> f2) {
        return f1.andThen(f2).apply(a, b);
    }

}
