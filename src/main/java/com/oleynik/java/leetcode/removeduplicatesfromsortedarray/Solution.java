package com.oleynik.java.leetcode.removeduplicatesfromsortedarray;

import java.util.Arrays;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j += 1;
                nums[j] = nums[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        // Input: nums = [1,1,2]
        // Output: 2, nums = [1,2,_]
        int[] nums = new int[]{1, 1, 2};
        int result = solution.removeDuplicates(nums);
        System.out.println(result);
        System.out.println(Arrays.toString(nums));

        // Input: nums = [0,0,1,1,1,2,2,3,3,4]
        // Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
        int[] nums2 = new int[]{0,0,1,1,1,2,2,3,3,4};
        int result2 = solution.removeDuplicates(nums2);
        System.out.println(result2);
        System.out.println(Arrays.toString(nums2));
    }
}
