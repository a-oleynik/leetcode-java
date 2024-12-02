package com.oleynik.java.leetcode.validparentheses;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public boolean isValid(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        char currentChar;
        char check;
        for (int i = 0; i < s.length(); i++) {
            currentChar = s.charAt(i);
            if (currentChar == '(' || currentChar == '[' || currentChar == '{') {
                deque.push(currentChar);
                continue;
            }
            if (deque.isEmpty())
                return false;

            switch (currentChar) {
                case ')':
                    check = deque.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = deque.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = deque.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }

        }
        return deque.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("([]{})"));
        System.out.println(solution.isValid("([)]"));
    }

}
