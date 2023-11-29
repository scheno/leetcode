package com.schening.leetcode.tree.traverse.iteration;

import com.schening.leetcode.tree.TreeNode;

import java.util.*;

/**
 * 144. 二叉树的前序遍历
 *
 * @author xinghuan
 * @since 2023/8/22 22:47
 */
public class LeetCode144 {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (Objects.isNull(root)) {
            return result;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()) {
            TreeNode node = stack.pop();
            result.add(node.val);
            if (Objects.nonNull(node.right)) {
                stack.push(node.right);
            }
            if (Objects.nonNull(node.left)) {
                stack.push(node.left);
            }
        }

        return result;
    }

}
