package com.schening.leetcode.tree;

import com.schening.leetcode.tree.traverse.TreeNode;

/**
 * LeetCode701. 二叉搜索树中的插入操作
 *
 * 题解：设置parent节点，找到parent节点之后，直接进行插入，然后进行返回
 */
public class LeetCode701 {

    private TreeNode parent;

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }

        traverse(root, val);
        return root;
    }

    public void traverse(TreeNode root, int val) {
        if (root == null) {
            root = new TreeNode(val);
            if (parent.val > val) {
                parent.left = root;
            } else {
                parent.right = root;
            }
            return;
        }

        parent = root;

        if (root.val > val) {
            traverse(root.left, val);
        } else {
            traverse(root.right, val);
        }
    }

}
