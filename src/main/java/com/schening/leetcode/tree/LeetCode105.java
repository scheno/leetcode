package com.schening.leetcode.tree;

import com.schening.leetcode.tree.traverse.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode105. 从前序与中序遍历序列构造二叉树
 * <p>
 * 题解： * 题解：定义Map，记录中序遍历位置。中序遍历数量和后续遍历一致，可以通过数量确定前遍历分割
 */
public class LeetCode105 {

    static Map<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return getRoot(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
    }

    public static TreeNode getRoot(int[] preorder, int[] inorder, int preStart, int preEnd, int inStart, int inEnd) {
        if (preEnd < preStart || inEnd < inStart) {
            return null;
        }

        TreeNode root = new TreeNode();
        root.val = preorder[preStart];

        int inIndex = map.get(root.val);

        int leftLength = inIndex - inStart;

        root.left = getRoot(preorder, inorder, preStart + 1, preStart + leftLength,  inStart, inIndex - 1);
        root.right = getRoot(preorder, inorder, preStart + leftLength + 1, preEnd, inIndex + 1, inEnd);

        return root;
    }

}
