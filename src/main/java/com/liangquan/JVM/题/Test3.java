package com.liangquan.JVM.题;

public class Test3 {
    public static void main(String[] args) {
        Test3_A[] test3As = new Test3_A[10];
    }
}

class Test3_A{
    static {
        System.out.println("Test3_A的静态代码块执行了！");
    }
}