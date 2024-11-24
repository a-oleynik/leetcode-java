package com.oleynik.interviewtraining.lesson1;

public class ArraySum {
    public static void main(String[] args) {
        int[] array = new int[]{1, 4, 5, 7, 8, 14, 67};
        System.out.println(sum(array));
    }
    public static int sum(int[] array){
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return sum;
    }
}
