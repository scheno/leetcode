package com.schening.leetcode.tree.traverse;

import java.util.LinkedList;
import java.util.Queue;

/**
 * LeetCode117. 填充每个节点的下一个右侧节点指针 II
 * <p>
 * 题解：进行每层处理时，当索引位置不是最后一个时，通过peek方法获取下一个节点
 */
public class LeetCode117 {

    public Node connect(Node root) {
        if (root == null) {
            return root;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (i < size - 1) {
                    node.next = queue.peek();
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }

        return root;
    }

}
