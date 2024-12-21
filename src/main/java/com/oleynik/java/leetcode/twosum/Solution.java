package com.oleynik.java.leetcode.twosum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSumNaive(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example data
        int[][] numsArray = {
                {2, 7, 11, 15},
                {3, 2, 4},
                {3, 3}
        };
        int[] targets = {9, 6, 6};

        for (int i = 0; i < numsArray.length; i++) {
            int[] nums = numsArray[i];
            int target = targets[i];
            System.out.println("Example " + (i + 1) + ": nums = " + Arrays.toString(nums) + ", target = " + target);

            int[] result = solution.twoSum(nums, target);
            if (result != null) {
                System.out.println("twoSum result for example " + (i + 1) + ": [" + result[0] + ", " + result[1] + "]");
            } else {
                System.out.println("No solution found using twoSum for example " + (i + 1) + ".");
            }

            result = solution.twoSumNaive(nums, target);
            if (result != null) {
                System.out.println("twoSumNaive result for example " + (i + 1) + ": [" + result[0] + ", " + result[1] + "]");
            } else {
                System.out.println("No solution found using twoSumNaive for example " + (i + 1) + ".");
            }
        }
    }
}
