package com.schening.leetcode.tree;

import com.schening.leetcode.tree.traverse.TreeNode;

/**
 * LeetCode98. 验证二叉搜索树
 *
 * 题解：中序遍历二叉树，判断节点是否依次增大，可以利用前置节点进行辅助判断
 */
public class LeetCode98 {

    // 递归
    TreeNode prev;

    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }
        // 左
        boolean left = isValidBST(root.left);
        if (!left) {
            return false;
        }
        // 中
        if (prev != null && root.val <= prev.val) {
            return false;
        }
        prev = root;
        // 右
        boolean right = isValidBST(root.right);
        return right;

    }
}
