package com.oleynik.java.leetcode.linkedlistcycle;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean hasCycleWithSet(ListNode head) {
        Set<ListNode> visited = new HashSet<>();
        while (head != null) {
            if (visited.contains(head)) {
                return true;
            }
            visited.add(head);
            head = head.next;
        }
        return false;
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // Create a sample list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Create a cycle: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        Solution solution = new Solution();
        boolean hasCycle = solution.hasCycleWithSet(head);

        System.out.println("The linked list has a cycle: " + hasCycle);

        hasCycle = solution.hasCycle(head);

        System.out.println("The linked list has a cycle: " + hasCycle);
    }
}
