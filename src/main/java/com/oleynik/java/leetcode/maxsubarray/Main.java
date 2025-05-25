package com.oleynik.java.leetcode.maxsubarray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example data
        int[][] numsArray = {
                {-2, 1, -3, 4, -1, 2, 1, -5, 4},
                {1},
                {5, 4, -1, 7, 8},
                {-1, -2, -3, -4}
        };

        for (int i = 0; i < numsArray.length; i++) {
            int[] nums = numsArray[i];
            System.out.println("Example " + (i + 1) + ": nums = " + Arrays.toString(nums));
            int result = solution.maxSubArray2(nums);
            System.out.println("maxSubArray result for example " + (i + 1) + ": " + result);
        }
    }
}
