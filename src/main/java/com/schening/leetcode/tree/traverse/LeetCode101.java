package com.schening.leetcode.tree.traverse;

/**
 * LeetCode101.对称二叉树
 * <p>
 * 题解：递归处理，比较左右节点是否为空、一侧是否为空、左右节点值是否为空。
 * 判断完成后再判断左右孩子节点两侧值是否一致
 */
public class LeetCode101 {

    /**
     * @param root
     * @return
     */
    public boolean isSymmetric(TreeNode root) {
        return isSymmetric(root.left, root.right);
    }

    /**
     * @param left  左孩子节点
     * @param right 右孩子节点
     * @return 比较结果
     */
    public boolean isSymmetric(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null && right != null) {
            return false;
        }

        if (left != null && right == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }

}
