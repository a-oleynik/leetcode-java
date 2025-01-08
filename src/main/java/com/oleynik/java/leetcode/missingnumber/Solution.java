package com.oleynik.java.leetcode.missingnumber;

import java.util.Arrays;

class Solution {
    // Arithmetic progression
    // 1, 2, 3, 4 delta is 1
    // Sn = (a1 + an) * n/2
    public int missingNumber1(int[] nums) {
        int n = nums.length;
        int sumOfProgression = (1 + n) * n / 2;
        for (int i = 0; i < n; i++) {
            sumOfProgression -= nums[i];
        }

        return sumOfProgression;
    }

    // Xor
    // a ^ b
    // bit of a == bit of b: a^b == 0
    // bit of a != bit of b: a^b == 1
    // 101^001 == 100
    public int missingNumber2(int[] nums) {
        int n = nums.length;
        int n1 = nums.length + 1;
        int xor1 = 0;

        for (int i = 0; i < n; i++) {
            xor1 ^= nums[i];
        }

        for (int i = 0; i < n1; i++) {
            xor1 ^= i;
        }

        return xor1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example data
        int[][] numsArray = {
                {3, 0, 1},
                {0, 1},
                {9, 6, 4, 2, 3, 5, 7, 0, 1},
                {0}
        };

        for (int i = 0; i < numsArray.length; i++) {
            int[] nums = numsArray[i];
            System.out.println("Example " + (i + 1) + ": nums = " + Arrays.toString(nums));
            int result = solution.missingNumber1(nums);
            System.out.println("missingNumber1 result for example " + (i + 1) + ": " + result);
            result = solution.missingNumber2(nums);
            System.out.println("missingNumber2 result for example " + (i + 1) + ": " + result);
        }
    }
}
