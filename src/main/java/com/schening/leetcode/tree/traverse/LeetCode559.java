package com.schening.leetcode.tree.traverse;

/**
 * LeetCode559. N 叉树的最大深度
 * <p>
 * 题解：核心思想是是递归的返回值，通过返回值拿到树的深度
 */
public class LeetCode559 {

    public int maxDepth(Node root) {
        return getDepth(root);
    }

    public int getDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int depth = 0;
        for (Node node : root.children) {
            depth = Math.max(depth, getDepth(node));
        }
        return depth + 1;
    }
}
