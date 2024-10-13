package com.liangquan.InterviewQuestion.A02_protoBuf;

import com.google.protobuf.InvalidProtocolBufferException;
import com.liangquan.InterviewQuestion.A02_protoBuf.Users.Users;
import com.liangquan.InterviewQuestion.A02_protoBuf.ProtoUsers.ProtoUsers;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @ClassName：FastStart
 * @Author: liangquan
 * @Date: 2024/10/13 11:57
 * @Description: 传统序列化(Serializable)和protobuf 的序列化和反序列化比较
 */
public class FastStart {

    public static void main(String[] args) {
        FastStart fastStart = new FastStart();

        // Serializable序列化
        Users users = fastStart.Users();
        byte[] serializedUsers = fastStart.serializeUsers(users);
        System.out.println("Serialized Users Size (Serializable): " + serializedUsers.length + " bytes");

        // protoUser序列化
        ProtoUsers protoUsers = fastStart.protoUsers();
        byte[] serializedProtoUsers = protoUsers.toByteArray();
        System.out.println("Serialized ProtoUsers Size (Protobuf): " + serializedProtoUsers.length + " bytes");

        // 反序列化
        fastStart.deserializeUsers(serializedUsers);
        fastStart.deserializeProtoUsers(serializedProtoUsers);
    }

    public Users Users() {
        return new Users(1, "jcen", 20, "12345678");
    }

    public byte[] serializeUsers(Users users) {
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(users);
            return bos.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ProtoUsers protoUsers() {
        ProtoUsers protoUsers = ProtoUsers.newBuilder()
                .setId(1)
                .setName("jcen")
                .setAge(20)
                .setPassword("12345678")
                .build();
        return protoUsers;
    }

    public void deserializeUsers(byte[] data) {
        long startTime = System.nanoTime();
        try (ByteArrayInputStream bis = new ByteArrayInputStream(data);
             ObjectInputStream ois = new ObjectInputStream(bis)) {
            Users users = (Users) ois.readObject();
            long endTime = System.nanoTime();
            System.out.println("Deserialized Users: " + users.getName() + ", " + users.getAge());
            System.out.println("Deserialization Time (Serializable): " + (endTime - startTime) + " ns");
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void deserializeProtoUsers(byte[] data) {
        long startTime = System.nanoTime();
        try {
            ProtoUsers protoUsers = ProtoUsers.parseFrom(data);
            long endTime = System.nanoTime();
            System.out.println("Deserialized ProtoUsers: " + protoUsers.getName() + ", " + protoUsers.getAge());
            System.out.println("Deserialization Time (Protobuf): " + (endTime - startTime) + " ns");
        } catch (InvalidProtocolBufferException e) {
            throw new RuntimeException(e);
        }
    }
}