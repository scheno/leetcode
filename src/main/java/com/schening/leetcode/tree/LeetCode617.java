package com.schening.leetcode.tree;

import com.schening.leetcode.tree.traverse.TreeNode;

/**
 * LeetCode617. 合并二叉树
 *
 * 题解：一侧节点为null，直接返回另一侧节点
 * 都不为空时，合并值。然后分别处理左孩子节点，右孩子节点
 */
public class LeetCode617 {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        if (root2 == null) {
            return root1;
        }

        root1.val = root1.val + root2.val;
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);

        return root1;
    }

}
