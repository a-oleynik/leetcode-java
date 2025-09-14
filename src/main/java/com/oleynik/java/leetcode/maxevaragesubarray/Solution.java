package com.oleynik.java.leetcode.maxevaragesubarray;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = nums[0];
        for (int i = 1; i < k; i++) {
            sum += nums[i];
        }
        int maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];
            /*if(sum > maxSum){
                maxSum = sum;
            }*/
            maxSum = Math.max(sum, maxSum);
        }
        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 12, -5, -6, 50, 3};
        int k1 = 4;
        double result1 = new Solution().findMaxAverage(nums1, k1);
        System.out.printf("Example 1 Output: %.5f\n", result1);

        int[] nums2 = {5};
        int k2 = 1;
        double result2 = new Solution().findMaxAverage(nums2, k2);
        System.out.printf("Example 2 Output: %.5f\n", result2);
    }

}
