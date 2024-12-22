package com.oleynik.java.leetcode.reverselinkedlist;

public class Solution {
    public ListNode reverseList(ListNode head) {
        // [previous] -> [head] -> [next] -> ...
        // [previous] <- [head] <- [next] <- ...
        // [next] <- [head] <- [previous] <- ...
        // [...] <- [previous] <- [head] <- ...
        ListNode previous = null;
        ListNode next;
        while(head != null) {
            next = head.next;
            head.next = previous;
            previous = head;
            head = next;
        }
        return previous;
    }

    public static void main(String[] args) {
        // Create a sample list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Print the original list
        System.out.println("Original list: " + head.printList());

        // Reverse the list
        Solution solution = new Solution();
        ListNode reversedHead = solution.reverseList(head);

        // Print the reversed list
        System.out.println("Reversed list: " + reversedHead.printList());
    }
}
