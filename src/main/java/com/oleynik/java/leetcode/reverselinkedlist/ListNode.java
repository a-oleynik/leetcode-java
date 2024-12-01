package com.oleynik.java.leetcode.reverselinkedlist;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }

    public String printList() {
        ListNode current = this;
        String result = "";
        while (current != null) {
            result += current.val;
            if (current.next != null) {
                result += " -> ";
            }
            current = current.next;
        }
        return result;
    }
}
