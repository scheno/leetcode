package com.schening.leetcode.tree.traverse;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode111. 二叉树的最小深度
 * <p>
 * 题解：当层中出现第一个左右孩子都为空的节点时，这个时候就是树的最小深度
 */
public class LeetCode111 {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        while (!queue.isEmpty()) {
            depth++;
            int size = queue.size();
            TreeNode cur;
            for (int i = 0; i < size; i++) {
                cur = queue.poll();
                // 如果当前节点的左右孩子都为空，直接返回最小深度
                if (cur.left == null && cur.right == null) {
                    return depth;
                }
                if (cur.left != null) queue.offer(cur.left);
                if (cur.right != null) queue.offer(cur.right);
            }
        }
        return depth;
    }

}
