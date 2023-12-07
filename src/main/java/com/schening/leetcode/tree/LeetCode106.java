package com.schening.leetcode.tree;

import com.schening.leetcode.tree.traverse.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode106. 从中序与后序遍历序列构造二叉树
 * <p>
 * 题解：定义Map，记录中序遍历位置。中序遍历数量和后续遍历一致，可以通过数量确定后续遍历分割
 */
public class LeetCode106 {

    static Map<Integer, Integer> map = new HashMap<>();

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return getRoot(inorder, postorder, 0, inorder.length - 1, 0, postorder.length - 1);
    }

    public static TreeNode getRoot(int[] inorder, int[] postorder, int inStart, int inEnd, int postStart, int postEnd) {
        if (postEnd < postStart || inEnd < inStart) {
            return null;
        }

        TreeNode root = new TreeNode();
        root.val = postorder[postEnd];

        int inIndex = map.get(root.val);
        int leftLength = inIndex - inStart;

        root.left = getRoot(inorder, postorder, inStart, inIndex - 1, postStart, postStart + leftLength - 1);
        root.right = getRoot(inorder, postorder, inIndex + 1, inEnd, leftLength, postEnd - 1);

        return root;
    }

}
