package com.oleynik.java.leetcode.pascalstriangle;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        List<Integer> current;
        List<Integer> previous = new ArrayList<>(1);
        previous.add(1);
        result.add(previous);
        for (int i = 1; i < numRows; i++) {
            current = new ArrayList<>(i + 1);
            current.add(1);
            for (int j = 1; j < i; j++) {
                current.add(previous.get(j - 1) + previous.get(j));
            }
            current.add(1);
            result.add(current);
            previous = current;
        }
        return result;
    }

    public List<List<Integer>> generate2(int numRows) {
        List<List<Integer>> result = new ArrayList<>(numRows);
        List<Integer> current = new ArrayList<>(1);
        current.add(1);
        result.add(current);
        long c;
        for (int i = 1; i < numRows; i++) {
            c = 1;
            current = new ArrayList<>(i + 1);
            for (int j = 0; j < i; j++) {
                current.add((int) c);
                c = c * (i - j);
                c = c / (j + 1);
            }
            current.add(1);
            result.add(current);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] numRowsExamples = {1, 2, 5, 7};

        for (int i = 0; i < numRowsExamples.length; i++) {
            int numRows = numRowsExamples[i];
            System.out.println("Example " + (i + 1) + ": numRows = " + numRows);

            List<List<Integer>> result1 = solution.generate(numRows);
            System.out.println("generate result:");
            printTriangle(result1);

            List<List<Integer>> result2 = solution.generate2(numRows);
            System.out.println("generate2 result:");
            printTriangle(result2);

            System.out.println();
        }
    }

    private static void printTriangle(List<List<Integer>> triangle) {
        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }

}
