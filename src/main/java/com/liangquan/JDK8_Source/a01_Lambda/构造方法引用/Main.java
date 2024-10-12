package com.liangquan.JDK8_Source.a01_Lambda.构造方法引用;

import java.util.LinkedList;
import java.util.function.Supplier;

/**
 * @ClassName：Main
 * @Author: liangquan
 * @Date: 2024/9/28 17:39
 * @Description: 实现的功能？
 */
public class Main {

    public static void main(String[] agrs) {
        // 使用无参构造方法
        Supplier<Person> personSupplier = Person::new;
        Person person1 = personSupplier.get(); // 通过无参构造方法创建对象
        System.out.println(person1); // 输出: Person{name='默认名称'}

        // 使用有参构造方法 (通过自定义的 Function)
        java.util.function.Function<String, Person> personCreator = Person::new;
        Person person2 = personCreator.apply("Alice"); // 通过有参构造方法创建对象
        System.out.println(person2); // 输出: Person{name='Alice'}


        LinkedList<Person> people = new LinkedList<Person>() {{
            add(person1);
        }};
        System.out.println("people = " + people);

    }
}
