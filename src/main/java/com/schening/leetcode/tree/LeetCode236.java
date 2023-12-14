package com.schening.leetcode.tree;

import com.schening.leetcode.tree.traverse.TreeNode;

/**
 * LeetCode236. 二叉树的最近公共祖先
 *
 * 题解：先判断根节点是否满足任一节点，如果满足直接返回
 * 求左子树节点和右子树节点，如果任一方为空则返回另一方
 * 如果两侧都不为空，说明该节点左右孩子节点就是p，q，直接返回
 */
public class LeetCode236 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }

        if (root.val == p.val || root.val == q.val) {
            return root;
        }

        TreeNode leftNode = lowestCommonAncestor(root.left, p, q);
        TreeNode rightNode = lowestCommonAncestor(root.right, p, q);

        if (leftNode == null) {
            return rightNode;
        }
        if (rightNode == null) {
            return leftNode;
        }
        return root;
    }

}
