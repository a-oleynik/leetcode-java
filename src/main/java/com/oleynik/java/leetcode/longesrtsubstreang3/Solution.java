package com.oleynik.java.leetcode.longesrtsubstreang3;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int maxLength = 0;
        boolean[] visited = new boolean[256];
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            if (visited[s.charAt(right)]) {
                while (s.charAt(left) != s.charAt(right)) {
                    visited[s.charAt(left)] = false;
                    left++;
                }
                left++;
            } else {
                visited[s.charAt(right)] = true;
                maxLength = Math.max(maxLength, right - left + 1);
            }
            right++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "3qwxrtgeeksforgeeks";
        System.out.println(new Solution().lengthOfLongestSubstring(s));
    }
}
