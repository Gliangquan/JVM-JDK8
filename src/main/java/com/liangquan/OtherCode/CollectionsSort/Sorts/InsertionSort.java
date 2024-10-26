package com.liangquan.OtherCode.CollectionsSort.Sorts;

/**
 * @ClassName：InsertionSort
 * @Author: liangquan
 * @Date: 2024/10/26 11:24
 * @Description: 插入排序
 */
public class InsertionSort {

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();

        int[] arr = new int[]{5, 6, 3, 1, 4};
        insertionSort.insertionSort(arr);

        // 输出排序后的数组
        System.out.print("排序后的数组: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }


    /* *
        插入排序还有变种：
        1.二分插入排序
        2.成对插入排序
        3.希尔插入排序

        第一，插入排序是原地排序算法吗？
        空间复杂度是O（1），是
        第二，插入排序是稳定的排序算法吗？
        可以把相同的元素插入到后面，是
        第三，插入排序的时间复杂度是多少？
        最好时间复杂度为 O（n）。
        最坏情况时间复杂度为 O（n2）。
        平均时间复杂度为 O（n2）。
     */
    private void insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) return;

        for (int i = 1; i < arr.length; i++) {
            int value = arr[i]; // 待插入元素
            int j = i - 1;
            for (; j >= 0; j--) {
                if (arr[j] > value) {
                    arr[j + 1] = arr[j]; // 数据移动
                } else break;
            }
            arr[j + 1] = value; // 插入数据
        }
    }
}
