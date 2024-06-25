package com.schening.leetcode.array.remove;

/**
 * 283. 移动零
 *
 * @author schen
 * @since 2024-06-24 23:57
 */
public class MoveZero {

    public void moveZeroes(int[] nums) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != 0) {
                nums[slowIndex++] = nums[fastIndex];
            }
        }
        for (int i = slowIndex; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

}
