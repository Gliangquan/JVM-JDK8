package com.liangquan.InterviewQuestion.A01_序列化和反序列化.A01_1_protoBuf.Users;

import java.io.Serializable;

/**
 * @ClassName：User
 * @Author: liangquan
 * @Date: 2024/10/13 09:50
 * @Description: 用户接口实现序列化
 */
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;

    private String name;

    private int age;

    // transient: `transient`关键字标记不需要序列化的字段。如敏感数据
    private transient String password;

    public Users() {}

    public Users(int id, String name, int age, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
