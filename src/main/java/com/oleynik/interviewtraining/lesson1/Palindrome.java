package com.oleynik.interviewtraining.lesson1;

public class Palindrome {
    public static boolean isPalindrome(String a) {
        if (a == null) {
            throw new IllegalArgumentException("String is null");
        }
        a = a.toLowerCase().replace(" ", "");
        if (a.isEmpty()) return true;
        return a.contentEquals(new StringBuilder(a).reverse());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("a"));
        System.out.println(isPalindrome("abba"));
        System.out.println(isPalindrome("а роза упала на лапу Азора"));
    }
}
