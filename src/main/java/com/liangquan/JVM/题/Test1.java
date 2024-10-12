package com.liangquan.b类的生命周期.题;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("A");
        new Test1();
        new Test1();
    }

    public Test1() {
        System.out.println("B");
    }

    {
        System.out.println("C");
    }

    static {
        System.out.println("D");
    }

    /***
     * 静态代码块在类加载的时候只执行一次。程序一开始，就会先打印出 "D"。
     * 程序的入口Main，就会先打印出 "A"。
     * 创建 Test1 对象 (new Test1();):
     * 初始化实例代码块 ({}): 实例代码块在每个对象创建时都会执行，所以会打印出 "C"。
     * 构造方法 (public Test1())： 构造方法用于初始化对象，在这里会打印出 "B"。
     * <p>
     * DACBCB
     */
}
