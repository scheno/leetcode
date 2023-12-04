package com.schening.leetcode.tree.traverse.recursion;

import com.schening.leetcode.tree.traverse.TreeNode;

/**
 * LeetCode222. 完全二叉树的节点个数
 * <p>
 * 题解：递归法，利用递归返回已经返回的节点数量，当为空节点时，数量为0，为叶子节点时，数量为1
 */
public class LeetCode222 {

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

}
