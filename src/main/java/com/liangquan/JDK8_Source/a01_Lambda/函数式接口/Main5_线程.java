package com.liangquan.JDK8_Source.a01_Lambda.函数式接口;

/**
 * @ClassName：Main5_线程
 * @Author: liangquan
 * @Date: 2024/9/28 11:27
 * @Description: 实现的功能？
 */
public class Main5_线程 {

    public static void main(String[] args) {
        // 线程1
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable");
            }
        };
        new Thread(runnable).start();

        // 线程2
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
            }
        });

        // 线程3
        // Lambda简化写法
        new Thread(() -> System.out.println("2")).start();
        new Thread(System.out::println).start();

    }
}
