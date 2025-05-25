package com.oleynik.java.leetcode.maxsubarray;

// https://leetcode.com/problems/maximum-subarray/
public class Solution {
    // O(n^2) time complexity solution
    public int maxSubArray1(int[] nums) {
        int res = nums[0];
        int currSum;
        final int length = nums.length;
        for (int i = 0; i < length; i++) {
            currSum = 0;
            for (int j = i; j < length; j++) {
                currSum = currSum + nums[j];
                if (currSum > res) {
                    res = currSum;
                }
            }
        }
        return res;
    }

    // O(n) time complexity solution
    public int maxSubArray2(int[] nums) {
        int max = nums[0];
        int currentSum;
        final int length = nums.length;
        for (int i = 1; i < length; i++) {
            currentSum = nums[i] + nums[i - 1];
            if (currentSum > nums[i]) {
                nums[i] = currentSum;
            }
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }
}
