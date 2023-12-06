package com.schening.leetcode.tree.traverse;

/**
 * LeetCode404. 左叶子之和
 *
 * 题解：迭代方式
 *      递归方式：当左孩子节点不为空，判断该左孩子节点是否为叶子节点，是的话进行返回
 */
public class LeetCode404 {

    public int sumOfLeftLeaves(TreeNode root) {
        return sumOfLeftLeaves(root, 0);
    }

    public int sumOfLeftLeaves(TreeNode root, int sum) {
        if (root == null) {
            return sum;
        }

        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum += root.left.val;
        }

        sum = sumOfLeftLeaves(root.left, sum);
        sum = sumOfLeftLeaves(root.right, sum);

        return sum;
    }

}
