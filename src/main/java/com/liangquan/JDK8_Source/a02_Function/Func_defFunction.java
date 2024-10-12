package com.liangquan.JDK8_Source.a02_Function;

import com.liangquan.JDK8_Source.a01_Lambda.函数式接口.FunctionInterfaceTest;

import java.util.Comparator;
import java.util.function.Function;

/**
 * @ClassName：Func_defFunction
 * @Author: liangquan
 * @Date: 2024/10/12 15:08
 * @Description: Function中的默认方法
 */
public class Func_defFunction {


    /*
     *
    f.compose(g) 相当于 h(x) = f(g(x))
   default <V> Function<V, R> compose(Function<? super V, ? extends T> var1) {
        Objects.requireNonNull(var1);
        return (var2) -> {
            return this.apply(var1.apply(var2));
        };
    }

    f.andThen(g) 相当于 h(x) = g(f(x))
    default <V> Function<T, V> andThen(Function<? super R, ? extends V> var1) {
        Objects.requireNonNull(var1);
        return (var2) -> {
            return var1.apply(this.apply(var2));
        };
    }
    *
 */

    public static void main(String[] args) {
        Func_defFunction func_defFunction = new Func_defFunction();

        int i1 = func_defFunction.compute(2, value -> value * 5, value -> value + 1);
        int i2 = func_defFunction.compute2(2, value -> value * 5, value -> value + 1);

        System.out.println("i1 = " + i1); // i1 = 15
        System.out.println("i2 = " + i2); // i2 = 11
    }


    public int compute(int a, Function<Integer, Integer> f, Function<Integer, Integer> g) {
        return f.compose(g).apply(a); // f(g(x))
    }

    public int compute2(int a, Function<Integer, Integer> f, Function<Integer, Integer> g) {
        return f.andThen(g).apply(a); // g(f(x))
    }


}
