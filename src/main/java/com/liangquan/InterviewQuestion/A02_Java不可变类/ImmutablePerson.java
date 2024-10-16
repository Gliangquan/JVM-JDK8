package com.liangquan.InterviewQuestion.A02_Java不可变类;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* *
 * @Title:
 * @Author: liangquan
 * @Date: 2024-10-16 19:39:07
 * @Params:
 * @Return: null
 * @Description: 不可变类
 */
public final class ImmutablePerson {
    private final String name;
    private final int age;
    private final List<String> hobbies;

//    Java10才引入 List.copyOf()
//    public ImmutablePerson(String name, int age, List<String> hobbies) {
//        this.name = name;
//        this.age = age;
//        // 深拷贝列表以确保不可变
//        this.hobbies = List.copyOf(hobbies);
//    }

    public ImmutablePerson(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        // 深拷贝列表并将其包装为不可变列表
        this.hobbies = Collections.unmodifiableList(new ArrayList<>(hobbies));
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

//    Cannot assign a value to final variable 'age'
//    public void setAge(int age) {
//        this.age = age;
//    }

    public List<String> getHobbies() {
        // 返回不可变列表，确保外部无法修改
        return Collections.unmodifiableList(hobbies);
    }


    // 修改字段的静态方法
    public static void modifyImmutablePerson(ImmutablePerson person, String newName, int newAge, List<String> newHobbies) throws Exception {
        // 使用反射修改字段
        Field nameField = ImmutablePerson.class.getDeclaredField("name");
        Field ageField = ImmutablePerson.class.getDeclaredField("age");
        Field hobbiesField = ImmutablePerson.class.getDeclaredField("hobbies");

        // 设置字段为可访问
        nameField.setAccessible(true);
        ageField.setAccessible(true);
        hobbiesField.setAccessible(true);

        // 修改字段值
        nameField.set(person, newName);
        ageField.set(person, newAge);
        hobbiesField.set(person, Collections.unmodifiableList(new ArrayList<>(newHobbies))); // 深拷贝并设置为不可变
    }

    public static void main(String[] args) {
        try {
            List<String> hobbies = new ArrayList<>();
            hobbies.add("Reading");
            hobbies.add("Traveling");

            // 创建不可变对象
            ImmutablePerson person = new ImmutablePerson("John", 30, hobbies);
            System.out.println("Before modification: " + person.getName() + ", " + person.getAge() + ", " + person.getHobbies());

            // 使用反射修改对象
            List<String> newHobbies = new ArrayList<>();
            newHobbies.add("Gaming");
            modifyImmutablePerson(person, "Jane", 25, newHobbies);

            // 查看修改后的值
            System.out.println("After modification: " + person.getName() + ", " + person.getAge() + ", " + person.getHobbies());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}