package com.schening.leetcode.tree.traverse;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LettCode226.翻转二叉树
 * <p>
 * 题解：递归处理或者迭代处理，采用迭代时，只能先先序，或者后续处理
 */
public class LeetCode226 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return root;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left != null) { queue.offer(node.left); }
            if (node.right != null) { queue.offer(node.right); }
            swap(node);
        }

        return root;
    }

    public void swap(TreeNode root) {
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

}
