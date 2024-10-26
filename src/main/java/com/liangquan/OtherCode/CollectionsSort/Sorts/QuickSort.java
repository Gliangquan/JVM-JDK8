package com.liangquan.OtherCode.CollectionsSort.Sorts;

/**
 * @ClassName：QuickSort
 * @Author: liangquan
 * @Date: 2024/10/26 11:33
 * @Description: 快速排序
 */
public class QuickSort {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();

        int[] arr = new int[]{5, 6, 3, 1, 4};
        quickSort.quickSort(arr, 0, arr.length - 1);

        // 输出排序后的数组
        System.out.print("排序后的数组: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public void quickSort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        // 获取分区点
        int pivotIndex = partition(arr, start, end);

        // 递归排序左边部分
        quickSort(arr, start, pivotIndex - 1);
        
        // 递归排序右边部分
        quickSort(arr, pivotIndex + 1, end);
    }

    private int partition(int[] arr, int start, int end) {
        int pivot = arr[end]; // 选择最后一个元素作为基准
        int i = start - 1; // i指向小于基准值的最后一个元素位置

        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // 将基准元素放到正确的位置
        swap(arr, i + 1, end);

        return i + 1; // 返回分区点的索引
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}