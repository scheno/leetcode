package com.schening.leetcode.tree.traverse.iteration;

import com.schening.leetcode.tree.traverse.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Stack;

/**
 * 94. 二叉树的中序遍历
 *
 * @author xinghuan
 * @since 2023/8/22 22:54
 */
public class LeetCode94 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (Objects.isNull(root)) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()) {
            TreeNode node = stack.peek();
            if (Objects.nonNull(node.left)) {
                stack.push(node.left);
            } else {
                result.add(node.val);
                stack.pop();
                if (Objects.nonNull(node.right)) {
                    stack.push(node.right);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        LeetCode94 leetCode94 = new LeetCode94();
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node1.right = node2;
        node2.left = node3;
        leetCode94.inorderTraversal(node1);
    }

}
