package com.oleynik.java.leetcode.insertintobst;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) {
            return new TreeNode(val);
        }

        if(root.val == val) {
            return root;
        }

        if (val < root.val) {
            root.left = insertIntoBST(root.left, val);
        }
        else {
            root.right = insertIntoBST(root.right, val);
        }

        return root;
    }

    static void displayTree(TreeNode root) {
        if (root == null) {
            System.out.println("Tree is empty");
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            while (levelSize > 0) {
                TreeNode node = queue.poll();
                System.out.print(node.val + " ");
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
                levelSize--;
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TreeNode root = null;
        Solution solution = new Solution();

        // Creating the following BST
        //      50
        //     /  \
        //    30   70
        //   / \   / \
        //  20 40 60 80

        root = solution.insertIntoBST(root, 50);
        root = solution.insertIntoBST(root, 30);
        root = solution.insertIntoBST(root, 20);
        root = solution.insertIntoBST(root, 40);
        root = solution.insertIntoBST(root, 70);
        root = solution.insertIntoBST(root, 60);
        root = solution.insertIntoBST(root, 80);
        root = solution.insertIntoBST(root, 100);
        root = solution.insertIntoBST(root, 15);
        root = solution.insertIntoBST(root, 25);
        root = solution.insertIntoBST(root, 91);

        displayTree(root);
    }
}

