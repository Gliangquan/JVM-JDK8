package com.liangquan.c类加载器;

import java.io.IOException;
import java.util.HashMap;

public class Test1 {

    public static void main(String[] args) throws IOException {
        HashMap
        ClassLoader classLoader = String.class.getClassLoader();
        System.out.println("classLoader = " + classLoader);

        /*  *
         * classLoader = null，打印出来为空，
         * 因为类加载器是虚拟机里面的，通过java代码是拿不到来操作的，
         * 所以打印为null
         */

        System.in.read();
    }

}
