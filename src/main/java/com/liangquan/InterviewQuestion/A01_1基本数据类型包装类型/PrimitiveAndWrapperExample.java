package com.liangquan.InterviewQuestion.A01_1基本数据类型包装类型;

import java.util.ArrayList;
import java.util.List;

public class PrimitiveAndWrapperExample {
    public static void main(String[] args) {
        // 基本数据类型
        int primitiveInt = 10;
        double primitiveDouble = 3.14;
        boolean primitiveBoolean = true;

        // 包装类型
        Integer wrappedInteger = 20;
        Double wrappedDouble = 6.28;
        Boolean wrappedBoolean = false;

        // 区别一：默认值不同
        int defaultPrimitiveInt;
        // 下面这行代码会编译错误，因为基本数据类型没有被初始化不能使用。
        // System.out.println(defaultPrimitiveInt); 

        Integer defaultWrappedInteger = null;
        System.out.println(defaultWrappedInteger);

        // 区别二：方法调用
        // 包装类型有很多方法可以调用
        System.out.println(wrappedInteger.toString());
        System.out.println(wrappedInteger.intValue() + 5);

        // 基本数据类型不能直接调用方法
        // primitiveInt.toString(); // 编译错误

        // 区别三：自动装箱和拆箱
        int autoBoxed = wrappedInteger; // 自动拆箱
        Integer autoBoxedInteger = primitiveInt; // 自动装箱

        // 区别四：在泛型中只能使用包装类型
        // 下面这样是不允许的，泛型中不能使用基本数据类型
//         List<int> intList = new ArrayList<>();
        List<Integer> integerList = new ArrayList<>();
    }
}