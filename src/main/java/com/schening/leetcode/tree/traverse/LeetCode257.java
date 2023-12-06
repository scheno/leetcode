package com.schening.leetcode.tree.traverse;

import java.util.ArrayList;
import java.util.List;

/**
 * LeetCode257. 二叉树的所有路径
 *
 * 题解：采用前序遍历+回溯算法，当左右子节点非空时，要进行节点移除
 */
public class LeetCode257 {

    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();

        binaryTreePaths(root, paths, path);
        return paths;
    }

    public void binaryTreePaths(TreeNode root, List<String> paths, List<Integer> path) {
        if (root == null) {
            return;
        }

        path.add(root.val);

        if (root.left == null && root.right == null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < path.size() - 1; i++) {
                sb.append(path.get(i)).append("->");
            }
            sb.append(path.get(path.size() - 1));
            paths.add(sb.toString());
            return;
        }

        if (root.left != null) {
            binaryTreePaths(root.left, paths, path);
            path.remove(path.size() - 1);
        }
        if (root.right != null) {
            binaryTreePaths(root.right, paths, path);
            path.remove(path.size() - 1);
        }
    }

}
