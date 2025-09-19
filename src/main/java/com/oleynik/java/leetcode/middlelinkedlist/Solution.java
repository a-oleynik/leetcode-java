package com.oleynik.java.leetcode.middlelinkedlist;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while (fast != null) {
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                break;
            }
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1: [1,2,3,4,5]
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);

        ListNode result1 = solution.middleNode(head1);
        System.out.println("Example 1 - Input: [1,2,3,4,5]");
        System.out.print("Output: [");
        printFromNode(result1);
        System.out.println("]");
        System.out.println("Expected: [3,4,5]\n");

        // Example 2: [1,2,3,4,5,6]
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);
        head2.next.next.next.next.next = new ListNode(6);

        ListNode result2 = solution.middleNode(head2);
        System.out.println("Example 2 - Input: [1,2,3,4,5,6]");
        System.out.print("Output: [");
        printFromNode(result2);
        System.out.println("]");
        System.out.println("Expected: [4,5,6]");
    }

    private static void printFromNode(ListNode node) {
        boolean first = true;
        while (node != null) {
            if (!first) {
                System.out.print(",");
            }
            System.out.print(node.val);
            node = node.next;
            first = false;
        }
    }
}
