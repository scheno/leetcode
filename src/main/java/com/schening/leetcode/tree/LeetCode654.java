package com.schening.leetcode.tree;

import com.schening.leetcode.tree.traverse.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode654. 最大二叉树
 *
 * 题解
 */
public class LeetCode654 {

    static Map<Integer, Integer> map = new HashMap<>();

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) {
            return null;
        }

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        return constructMaximumBinaryTree(nums, 0, nums.length);
    }

    public TreeNode constructMaximumBinaryTree(int[] nums, int start, int end) {
        if (start >= end) {
            return null;
        }

        int max = -1;
        for (int i = start; i < end; i++) {
            max = Math.max(max, nums[i]);
        }

        TreeNode treeNode = new TreeNode(max);

        treeNode.left = constructMaximumBinaryTree(nums, start, map.get(max));
        treeNode.right = constructMaximumBinaryTree(nums, map.get(max) + 1, end);

        return treeNode;
    }

}
