package com.oleynik.interviewtraining.lesson1;

public class ReversedString {
    public static void main(String[] args) {
        String myString = "Hello World!123";
        System.out.println(myString);
        System.out.println(reverse(myString));
        System.out.println(reverse2(myString));
    }

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    public static String reverse2(String s) {
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i > -1; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }
}
