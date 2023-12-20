package com.schening.leetcode.tree;

import com.schening.leetcode.tree.traverse.TreeNode;

/**
 * LeetCode450. 删除二叉搜索树中的节点
 */
public class LeetCode450 {

    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (root.val == key) {
            // 左右节点都为空
            if (root.left == null && root.right == null) {
                return null;
            }
            // 左节点不为空，右节点为空
            if (root.left != null && root.right == null) {
                return root.left;
            }
            //坐节点为空，右节点不为空
            if (root.left == null && root.right != null) {
                return root.right;
            }
            // 左右节点都不为空
            if (root.left != null && root.right != null) {
                TreeNode cur = root.right;
                while (cur.left != null) {
                    cur = cur.left;
                }
                TreeNode left = root.left;
                cur.left = left;
                root = root.right;
                return root;
            }
        }

        if (root.val > key) {
            root.left = deleteNode(root.left, key);
        }
        if (root.val < key) {
            root.right = deleteNode(root.right, key);
        }

        return root;
    }

}
