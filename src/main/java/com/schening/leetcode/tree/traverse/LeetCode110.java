package com.schening.leetcode.tree.traverse;

/**
 * LeetCode110. 平衡二叉树
 * <p>
 * 题解：递归返回左右子树高度，当高度差大于1时，返回-1，标志该树已非平衡树
 */
public class LeetCode110 {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return getDepth(root) != -1;
    }

    public int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = getDepth(root.left);
        if (leftDepth == -1) {
            return -1;
        }

        int rightDepth = getDepth(root.right);
        if (rightDepth == -1) {
            return -1;
        }

        return Math.abs(leftDepth - rightDepth) > 1 ? -1 : Math.max(leftDepth, rightDepth) + 1;
    }

}
