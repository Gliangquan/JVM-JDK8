package com.liangquan.OtherCode.CollectionsSort.Sorts;

/**
 * @ClassName：冒泡排序
 * @Author: liangquan
 * @Date: 2024/10/26 11:00
 * @Description: 冒泡排序
 */

public class BubbleSort {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();

        int[] arr = new int[]{5, 6, 3, 1, 4};
        bubbleSort.bubbleSort(arr);

        // 输出排序后的数组
        System.out.print("排序后的数组: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    public void bubbleSort(int[] a) {
        if ( a.length <= 1) return;

        for (int i = 0; i < a.length; i++) {
            boolean flag = false;
            for (int j = 0; j < a.length - i - 1; j++) { // 冒泡过的元素是有序的，无序再次排序
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) break;  // 没有交换数据，提前退出循环
        }
    }
}
