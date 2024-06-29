package com.schening.leetcode.array.remove;

/**
 * 977. 有序数组的平方
 *
 * @author schening
 * @since 2024-06-27 22:56
 */
public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int last = nums.length - 1;
        int[] result = new int[nums.length];
        int leftVal;
        int rightVal;
        while (left <= right) {
            leftVal = nums[left] * nums[left];
            rightVal = nums[right] * nums[right];
            if (leftVal >= rightVal) {
                result[last--] = leftVal;
                left++;
            } else {
                result[last--] = rightVal;
                right--;
            }
        }
        return result;
    }

}
