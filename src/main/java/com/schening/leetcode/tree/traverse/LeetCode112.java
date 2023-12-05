package com.schening.leetcode.tree.traverse;

/**
 * LeetCode112. 路径总和
 * <p>
 * 题解：节点为空时，代表还没找到符合条件的节点，所以需要返回false
 * 如果当前节点为叶子节点，判断targetSum与节点val是否相等，相等则返回true，否则返回false
 */
public class LeetCode112 {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            if (root.val == targetSum) {
                return true;
            } else {
                return false;
            }
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

}
