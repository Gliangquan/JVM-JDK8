package com.liangquan.JVM.题;

public class Test2 {
    public static void main(String[] args) {
        new B02();
        System.out.println(B02.a);
    }
}

class A02{
    static int a = 0;
    static {
        a = 1;
    }
}

class B02 extends A02{
    static {
        a = 2;
    }
}

/***
 * 解释：
 * 类加载顺序:
 * 由于 B02 继承了 A02，并且 main 方法中创建了 B02 对象，所以 A02 会先加载。
 * 在加载 A02 时，会执行其静态代码块，将 a 初始化为 1。
 * 接着，B02 会加载，执行其静态代码块，将 a 重新赋值为 2。
 * 静态变量的特性:
 * 静态变量属于类，而不是对象。
 * 因此，a 在 A02 和 B02 中都是同一个变量。
 * 程序执行流程:
 * new B02();： 创建 B02 对象，触发 B02 的加载，并执行其静态代码块，将 a 赋值为 2。
 * System.out.println(B02.a);： 打印 B02 类中的静态变量 a 的值，此时 a 的值为 2。
*/