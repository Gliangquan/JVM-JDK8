package com.liangquan.InterviewQuestion.A01_序列化和反序列化.A01_2_protoUsersPlus;


import com.liangquan.InterviewQuestion.A01_序列化和反序列化.A01_2_protoUsersPlus.Contacts.Contacts;
import com.liangquan.InterviewQuestion.A01_序列化和反序列化.A01_2_protoUsersPlus.Contacts.UserPlus;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @ClassName：TestWrite
 * @Author: liangquan
 * @Date: 2024/10/13 14:29
 * @Description: 把对象序列化后写入文件
 */
public class TestWrite {

    public static void main(String[] args) throws IOException {
        Contacts.Builder contaceBuilder = Contacts.newBuilder();

        // 读取bin文件  // 反序列化出对象
        Contacts contacts = null;
        try {
//            contacts = Contacts.parseFrom(
//                    new FileInputStream("src/main/java/com/liangquan/InterviewQuestion/A03_protoUsersPlus/Contacts.bin"));
//            Contacts.Builder builder = contacts.toBuilder();

            contaceBuilder.mergeFrom(
                    new FileInputStream("src/main/java/com/liangquan/InterviewQuestion/A03_protoUsersPlus/Contacts.bin"));

        } catch (FileNotFoundException e) {
            System.out.println("没有找到：Contacts.bin");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 增加一个联系人
        contaceBuilder.addUsers(addUsersInfo());

        // 序列化对象  写入文件
        FileOutputStream fileOutputStream =
                new FileOutputStream("src/main/java/com/liangquan/InterviewQuestion/A03_protoUsersPlus/Contacts.bin");
        contaceBuilder.build().writeTo(fileOutputStream);
        fileOutputStream.close();
    }

    private static UserPlus addUsersInfo() {
        UserPlus.Builder builder = UserPlus.newBuilder();
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------增加联系人---------");

        System.out.println("输入联系人姓名：");
        String name = scanner.nextLine();
        builder.setName(name);

        System.out.println("输入年龄");
        int age = scanner.nextInt();
        scanner.nextLine();
        builder.setAge(age);

        for (int i = 0; ; i++) {
            System.out.print("输入联系人电话" + (i + 1) + "(只输入回车完成电话新增)");
            String number = scanner.nextLine();
            if (number.isEmpty()) {
                break;
            }
            UserPlus.Phone.Builder phoneBuilder = UserPlus.Phone.newBuilder();
            phoneBuilder.setNumber(number);
            builder.addPhone(phoneBuilder);
        }
        System.out.println("添加联系人结束！");
        return builder.build();
    }
}
