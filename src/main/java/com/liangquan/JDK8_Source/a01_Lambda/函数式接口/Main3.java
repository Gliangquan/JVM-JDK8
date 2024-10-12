package com.liangquan.JDK8_Source.a01_Lambda.函数式接口;

/**
 * @ClassName：Main
 * @Author: liangquan
 * @Date: 2024/9/27 18:57
 * @Description:
 */

@FunctionalInterface
interface FunctionInterfaceTest2{
    void sayMessage();
}

public class Main2 {

    public void toSay(FunctionInterfaceTest2 functionInterfaceTest2){
        System.out.println(1);
        functionInterfaceTest2.sayMessage();
        System.out.println(2);
    }


    public static void main(String[] args) {
        Main2 main2 = new Main2();
        main2.toSay(new FunctionInterfaceTest2() {
            @Override
            public void sayMessage() {
                System.out.println("mytest1");
            }
        });

        // 方法二：Lambda表达式
        main2.toSay(() ->{
            System.out.println("mytest2");
        });

        // 方法三
        FunctionInterfaceTest2 mytest3 = () -> {
            System.out.println("mytest3");
        };

        System.out.println(mytest3.getClass());
        System.out.println(mytest3.getClass().getSuperclass()); // Object
        System.out.println(mytest3.getClass().getInterfaces()[0]); // FunctionInterfaceTest2
    }
}
