package com.liangquan.InterviewQuestion.A01_序列化和反序列化;

import java.io.*;

/**
 * @ClassName：TestUsers
 * @Author: liangquan
 * @Date: 2024/10/13 09:52
 * @Description: 实现的功能？
 */
public class TestUsers {

    private Users users;

    public static void main(String[] args){
        Users users = new Users();
        users.setName("Alice");
        users.setAge(30);
        users.setPassword("secret123");  // 密码设置为敏感信息

        // 序列化
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"));
            oos.writeObject(users);  // 序列化时，password字段将不会被保存
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 反序列化
        try {
            ObjectInputStream ios = new ObjectInputStream(new FileInputStream("user.ser"));
            Users user = (Users) ios.readObject();  // 使用 readObject() 读取整个对象
            ios.close();

            // 输出反序列化后的对象属性
            System.out.println("ID: " + user.getId());
            System.out.println("Name: " + user.getName());
            System.out.println("Age: " + user.getAge());
            System.out.println("Password: " + user.getPassword());  // 由于 password 是 transient，反序列化后应为 null
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
