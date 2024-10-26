package com.liangquan.OtherCode.CollectionsSort.Sorts;

/**
 * @ClassName：MergeSort
 * @Author: liangquan
 * @Date: 2024/10/26 11:33
 * @Description: 归并排序：原地排序（In-place Merge Sort）和非原地排序
 */
public class MergeSort {

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();

        int[] arr = new int[]{5, 6, 3, 1, 4};
        mergeSort.mergeSort(arr);

        // 输出排序后的数组
        System.out.print("排序后的数组: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public void mergeSort(int[] arr) {
        mergeSortInternally(arr, 0, arr.length - 1);
    }

    private static void mergeSortInternally(int[] arr, int start, int end) {
        if (start >= end) return;

        int mid = start + (end - start) / 2;

        mergeSortInternally(arr, start, mid);
        mergeSortInternally(arr, mid + 1, end);

        merge(arr, start, mid, end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int k = 0;

        int[] temp = new int[end - start + 1];
        while (i <= mid && j <= end) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // 将剩余的元素拷贝到 temp 中
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // 将排序后的结果拷贝回原数组
        System.arraycopy(temp, 0, arr, start, temp.length);
    }
}