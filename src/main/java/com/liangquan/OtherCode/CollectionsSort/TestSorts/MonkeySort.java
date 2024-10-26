package com.liangquan.OtherCode.CollectionsSort.TestSorts;

import com.google.common.primitives.Ints;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName：MonkeySort
 * @Author: liangquan
 * @Date: 2024/10/26 13:36
 * @Description: 沙雕排序-🐒排序
 */
public class MonkeySort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 6, 3, 1, 4};

        MonkeySort.monkeySort(arr);

        System.out.println(Arrays.toString(arr));
    }


    private static void monkeySort(int[] arr) {
        List<Integer> temp = Ints.asList(arr); // import com.google.common.primitives.Ints; -> google guava


        out:while (true) {
            Collections.shuffle(temp); // 打乱数组
            int[] res = Ints.toArray(temp);
            for (int i = 0; i < res.length - 1; i++) {
                if (res[i] > res[i + 1]) {
                    continue out;
                }
            }
            System.arraycopy(res, 0, arr, 0, res.length);
            break;
        }

    }
}
