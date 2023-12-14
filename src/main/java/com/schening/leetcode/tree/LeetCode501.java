package com.schening.leetcode.tree;

import com.schening.leetcode.tree.traverse.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode501. 二叉搜索树中的众数
 * <p>
 * 题解：中序遍历，每次遍历先对当前数进行计数，如果等于最大值，则加入队列。如果小于最大值，则清空结果，重新将当前值加入队列
 */
public class LeetCode501 {

    int count = 0;
    int maxCount = 1;

    TreeNode prev;

    List<Integer> result = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        traverse(root);
        int[] array = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            array[i] = result.get(i);
        }
        return array;
    }

    public void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        traverse(root.left);

        if (prev == null) {
            count = 1;
        } else if (prev.val == root.val) {
            count++;
        } else {
            count = 1;
        }

        prev = root;

        if (count == maxCount) {
            result.add(root.val);
        }

        if (count > maxCount) {
            maxCount = count;
            result.clear();
            result.add(root.val);
        }

        traverse(root.right);
    }

}
