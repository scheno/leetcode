package com.schening.leetcode.tree;

import com.schening.leetcode.tree.traverse.TreeNode;

/**
 * LeetCode700. 二叉搜索树中的搜索
 * <p>
 * 题解：合并root为空，或root匹配情况，定义返回结果，并接受左右子树返回的结果，最后返回最终结果
 */
public class LeetCode700 {

    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        }

        TreeNode result = null;
        if (root.val < val) {
            result = searchBST(root.right, val);
        }
        if (root.val > val) {
            result = searchBST(root.left, val);
        }
        return result;
    }

}
