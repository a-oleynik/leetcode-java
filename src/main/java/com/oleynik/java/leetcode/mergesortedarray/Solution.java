package com.oleynik.java.leetcode.mergesortedarray;

import java.util.Arrays;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // nums1 = [1,2,3,0,0,0], m = 3

        // nums2 = [2,5,6], n = 3
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;
        while (p1 > -1 && p2 > -1) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }

        while (p2 > -1) {
            nums1[p] = nums2[p2];
            p2--;
            p--;
        }

    }

public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums1, nums2;
    int m, n;

    // Example 1:
    //
    //Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    //Output: [1,2,2,3,5,6]
    //Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
    //The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

    nums1 = new int[]{1, 2, 3, 0, 0, 0};
    m = 3;
    nums2 = new int[]{2, 5, 6};
    n = 3;


    solution.merge(nums1, m, nums2, n);
    System.out.println(Arrays.toString(nums1));


    //Example 2:
    //
    //Input: nums1 = [1], m = 1, nums2 = [], n = 0
    //Output: [1]
    //Explanation: The arrays we are merging are [1] and [].
    //The result of the merge is [1].

    nums1 = new int[]{1};
    m = 1;
    nums2 = new int[]{};
    n = 0;

    solution.merge(nums1, m, nums2, n);
    System.out.println(Arrays.toString(nums1));

    //Example 3:
    //
    //Input: nums1 = [0], m = 0, nums2 = [1], n = 1
    //Output: [1]
    //Explanation: The arrays we are merging are [] and [1].
    //The result of the merge is [1].
    //Note that because m = 0, there are no elements in nums1.
    // The 0 is only there to ensure the merge result can fit in nums1.

    nums1 = new int[]{0};
    m = 0;
    nums2 = new int[]{1};
    n = 1;

    solution.merge(nums1, m, nums2, n);
    System.out.println(Arrays.toString(nums1));


    nums1 = new int[]{2, 0};
    m = 1;
    nums2 = new int[]{1};
    n = 1;

    solution.merge(nums1, m, nums2, n);
    System.out.println(Arrays.toString(nums1));
}
}
