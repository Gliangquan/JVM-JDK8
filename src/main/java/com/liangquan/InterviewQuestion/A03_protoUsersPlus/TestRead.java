package com.liangquan.InterviewQuestion.A03_protoUsersPlus;


import com.liangquan.InterviewQuestion.A03_protoUsersPlus.Contacts.Contacts;
import com.liangquan.InterviewQuestion.A03_protoUsersPlus.Contacts.UserPlus;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @ClassName：TestRead
 * @Author: liangquan
 * @Date: 2024/10/13 14:29
 * @Description: 读取文件反序列化输出
 */
public class TestRead {

    public static void main(String[] args) throws IOException {
        // 读取文件 // 反序列化
        Contacts contacts = Contacts.parseFrom(
                new FileInputStream("src/main/java/com/liangquan/InterviewQuestion/A03_protoUsersPlus/Contacts.bin"));
        // 打印文件
        printContact(contacts);

        System.out.println(contacts.toString());
    }

    private static void printContact(Contacts contacts) {
        int i = 0;
        for (UserPlus user : contacts.getUsersList()) {
            System.out.println("------联系人" + i++ + "----------");
            System.out.println("姓名：" + user.getName());
            System.out.println("年龄：" + user.getAge());
            int j = 0;
            for (UserPlus.Phone phone : user.getPhoneList()) {
                System.out.println("第" + j++ + "个电话：" + phone.getNumber());
            }
        }

    }
}
