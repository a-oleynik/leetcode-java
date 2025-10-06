package com.oleynik.java.leetcode.waterbottles;

import static java.lang.String.format;

public class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int totalBottles = numBottles;
        //int currentBottles = 0;
        int remain = 0;
        while (numBottles >= numExchange) {
            //currentBottles = numBottles / numExchange;
            remain = numBottles % numExchange;
            numBottles = numBottles / numExchange;
            //totalBottles = totalBottles + currentBottles;
            //numBottles = currentBottles + remain;
            totalBottles = totalBottles + numBottles;
            numBottles = numBottles + remain;
        }
        return totalBottles;
    }

    public static void main(String[] args) {
        com.oleynik.java.leetcode.waterbottles.Solution solution = new com.oleynik.java.leetcode.waterbottles.Solution();
        // Example 1: numBottles = 9, numExchange = 3, Output: 13
        int numBottles1 = 9;
        int numExchange1 = 3;
        int expected1 = 13;
        int result1 = solution.numWaterBottles(numBottles1, numExchange1);
        System.out.println(format("Example 1 - Input: numBottles = %d, numExchange = %d",
                numBottles1, numExchange1));
        System.out.println(format("Output: %d, Expected: %d - %s\n",
                result1, expected1, result1 == expected1 ? "PASS" : "FAIL"));

        // Example 2: numBottles = 15, numExchange = 4, Output: 19
        int numBottles2 = 15;
        int numExchange2 = 4;
        int expected2 = 19;
        int result2 = solution.numWaterBottles(numBottles2, numExchange2);
        System.out.println(format("Example 2 - Input: numBottles = %d, numExchange = %d",
                numBottles2, numExchange2));
        System.out.println(format("Output: %d, Expected: %d - %s\n",
                result2, expected2, result2 == expected2 ? "PASS" : "FAIL"));
    }
}
