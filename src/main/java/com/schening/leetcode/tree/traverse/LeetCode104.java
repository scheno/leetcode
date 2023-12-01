package com.schening.leetcode.tree.traverse;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode104. 二叉树的最大深度
 *
 * 题解：树的层序遍历，树的层数就是树的深度
 */
public class LeetCode104 {

    public int maxDepth(TreeNode root) {
        int depth = 0;

        if (root == null) {
            return depth;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }
            depth++;
        }

        return depth;
    }

}
