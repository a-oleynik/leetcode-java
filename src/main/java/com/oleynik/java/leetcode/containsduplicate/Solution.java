package com.oleynik.java.leetcode.containsduplicate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Solution {
    // Brute force
    //Time complexity: O(n^2)
    //Space complexity: O(1)
    public boolean containsDuplicate1(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Sorting
    //Time complexity: O(n log n)
    //Space complexity: O(1) or O(n)
    public boolean containsDuplicate2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }

    // Set
    //Time complexity: O(n)
    //Space complexity: O(n)
    public boolean containsDuplicate3(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>() {{
            add(nums[0]);
        }};
        for (int i = 1; i < n; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }


    //Arrays.stream
    //Time complexity: O(n)
    //Space complexity: O(n)
    public boolean containsDuplicate4(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example data
        int[][] numsArray = {
                {1, 2, 3, 1},
                {1, 2, 3, 4},
                {1, 1, 1, 3, 3, 4, 3, 2, 4, 2}
        };

        for (int i = 0; i < numsArray.length; i++) {
            int[] nums = numsArray[i];
            System.out.println("Example " + (i + 1) + ": nums = " + Arrays.toString(nums));
            boolean result = solution.containsDuplicate1(nums);
            System.out.println("containsDuplicate1 result for example " + (i + 1) + ": " + result);
            result = solution.containsDuplicate2(nums);
            System.out.println("containsDuplicate2 result for example " + (i + 1) + ": " + result);
            result = solution.containsDuplicate3(nums);
            System.out.println("containsDuplicate3 result for example " + (i + 1) + ": " + result);
            result = solution.containsDuplicate4(nums);
            System.out.println("containsDuplicate4 result for example " + (i + 1) + ": " + result);
        }
    }
}
