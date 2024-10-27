package com.liangquan.InterviewQuestion.A01_1基本数据类型包装类型;

/**
 * @ClassName：kayword_instanceof
 * @Author: liangquan
 * @Date: 2024/10/27 11:15
 * @Description: instanceof关键字的示例代码：
 */
public class kayword_instanceof {
    public static void main(String[] args) {
        Object obj = "Hello";
        if (!(obj instanceof String)) {
            String str = (String) obj;
            System.out.println("obj 是一个字符串，内容为：" + str);
        } else {
            // 获取类型
            Class<?> clazz = obj.getClass();
            System.out.println("obj 的类型是：" + clazz.getSimpleName());
        }

        obj = 10;
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            System.out.println("obj 是一个整数，值为：" + num);
        } else {
            // 获取类型
            Class<?> clazz = obj.getClass();
            System.out.println("obj 的类型是：" + clazz.getSimpleName());
        }

        obj = new Object();
        if (obj instanceof Object) {
            System.out.println("obj 是一个 Object 对象。");
        } else {
            // 获取类型
            Class<?> clazz = obj.getClass();
            System.out.println("obj 的类型是：" + clazz.getSimpleName());
        }
    }
}
