package com.schening.leetcode.tree.traverse;

/**
 * LeetCode513. 找树左下角的值
 *
 * 题解：递归方式：采用前序遍历，如果当前层级深度大于最大深度，也就是第一个节点，保存该节点的值
 */
public class LeetCode513 {

    private int maxDepth = -1;

    private int val;

    public int findBottomLeftValue(TreeNode root) {
        findBottomLeftValue(root, 0);
        return val;
    }

    public void findBottomLeftValue(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        depth++;

        if (root.left == null && root.right == null && maxDepth < depth) {
            val = root.val;
        }

        maxDepth = Math.max(depth, maxDepth);

        findBottomLeftValue(root.left, depth);
        findBottomLeftValue(root.right, depth);

    }
}
