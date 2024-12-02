package com.oleynik.java.leetcode.rotatearray;

import java.util.Arrays;

public class Solution {
    public void rotate(int[] nums, int k) {
        int length = nums.length;
        if (k > length) {k = k % length;}
        int [] temp = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = nums[length - k + i];
        }
        for (int i = length - k - 1, j = length - 1; i > -1; i--, j--) {
            nums[j] = nums[i];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 5;
        System.out.println("Original array: " + Arrays.toString(nums));
        solution.rotate(nums, k);
        System.out.println("Rotated array: " + Arrays.toString(nums));
    }
}
