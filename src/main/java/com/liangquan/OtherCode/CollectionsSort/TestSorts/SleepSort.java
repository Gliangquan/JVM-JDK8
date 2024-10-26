package com.liangquan.OtherCode.CollectionsSort.TestSorts;

/**
 * @ClassName：SleepSort
 * @Author: liangquan
 * @Date: 2024/10/26 13:52
 * @Description: 沙雕排序-😴睡眠排序
 */
public class SleepSort {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 6, 1, 4, 5, 2};

        sleepSort(arr);
    }

    private static void sleepSort(int[] arr) {
        for (final int num : arr) {
            new Thread(()->{
                try {
                    Thread.sleep(num);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("num = " + num);
            }).start();

        }
    }
}
