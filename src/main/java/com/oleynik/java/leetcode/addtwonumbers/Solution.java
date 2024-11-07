package com.oleynik.java.leetcode.addtwonumbers;

public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        int sum = 0;
        int val1, val2;
        ListNode currentListNode = new ListNode();
        ListNode result = currentListNode;
        ListNode nextNode = currentListNode;
        while (temp1 != null || temp2 != null) {
            val1 = 0;
            val2 = 0;
            if (null != temp1) {
                val1 = temp1.val;
                temp1 = temp1.next;
            }
            if (null != temp2) {
                val2 = temp2.val;
                temp2 = temp2.next;
            }
            sum = sum + val1 + val2;
            if (sum > 9) {
                nextNode.val = sum % 10;
                sum /= 10;
            } else {
                nextNode.val = sum;
                sum = 0;
            }
            currentListNode = nextNode;
            currentListNode.next = new ListNode();
            nextNode = currentListNode.next;
        }
        if (sum != 0) {
            nextNode.val = sum;
            currentListNode = nextNode;
            currentListNode.next = null;
        }
        currentListNode.next = null;
        return result;
    }

    public static void main(String[] args) {
        ListNode myListNode1 = getListNode(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode myListNode2 = getListNode(new int[]{9, 9, 9, 9});
        ListNode resultListNode = addTwoNumbers(myListNode1, myListNode2);
        System.out.println(resultListNode);
    }

    public static ListNode getListNode(int[] array) {
        ListNode currentListNode = new ListNode();
        ListNode listNode = currentListNode;
        ListNode nextNode = currentListNode;
        for (int i = 0; i < array.length; i++) {
            currentListNode = nextNode;
            currentListNode.val = array[i];
            currentListNode.next = new ListNode();
            nextNode = currentListNode.next;
        }
        currentListNode.next = null;
        return listNode;
    }
}
