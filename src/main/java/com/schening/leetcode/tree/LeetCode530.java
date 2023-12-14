package com.schening.leetcode.tree;

import com.schening.leetcode.tree.traverse.TreeNode;

/**
 * LeetCode530. 二叉搜索树的最小绝对差
 * <p>
 * 题解：中序遍历二叉搜索树，记录前一个值，比较当前值与后一个值差值的最小值
 */
public class LeetCode530 {

    TreeNode prev;

    Integer result = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) {
            return 0;
        }
        traversal(root);
        return result;
    }

    public void traversal(TreeNode root) {
        if (root == null) {
            return;
        }
        traversal(root.left);

        if (prev != null) {
            result = Math.min(result, root.val - prev.val);
        }
        prev = root;

        traversal(root.right);
    }
}
