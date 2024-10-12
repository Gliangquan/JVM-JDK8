package com.liangquan;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ints = new int[]{2,7,11,15};

        int target = 26;
        int[] ints1 = twoSum(ints, target);
        System.out.println("ints1 = " + Arrays.toString(ints1));
    }

    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int ch = target - nums[i];
            for (int j = i; j < nums.length; j++) {
                if (nums[j] == ch) {
                    return new int[]{i, j};
                }

            }
        }
        return new int[]{1, 1};
    }
}