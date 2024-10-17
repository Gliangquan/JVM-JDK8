package com.liangquan.InterviewQuestion.A03_Exception和Error的区别;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @ClassName：ExceptionAndError
 * @Author: liangquan
 * @Date: 2024/10/17 10:48
 * @Description: Exception和Error实例
 */
public class ExceptionAndError {

    public static void main(String[] args) {
        ExceptionAndError example = new ExceptionAndError();

        // Exception 例子
        try {
            example.fileRead();
        } catch (RuntimeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        // Error 例子
        try {
            example.createError();
        } catch (Error e) {
            System.out.println("Error caught: " + e.getMessage());
        }
    }

    // 文件读取：抛出Exception，使用try-with-resources
    public void fileRead() {
        // 使用 try-with-resources 自动关闭 FileInputStream
        try (FileInputStream fileInputStream = new FileInputStream("file.txt")) {
            System.out.println("fileInputStream = " + fileInputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException("文件未找到异常: " + e.getMessage());
        } catch (IOException e) {
            // 捕获文件关闭过程中的IOException
            throw new RuntimeException("文件读取异常: " + e.getMessage());
        }
    }

    // 模拟Error：Java堆内存溢出
    public void createError() {
        try {
            int[] array = new int[Integer.MAX_VALUE]; // 创建一个超大数组，模拟内存溢出错误
        } catch (OutOfMemoryError e) {
            throw new Error("内存溢出错误: " + e.getMessage());
        }
    }
}