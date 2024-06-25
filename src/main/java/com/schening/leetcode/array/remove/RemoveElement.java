package com.schening.leetcode.array.remove;

/**
 * 26. 删除有序数组中的重复项
 *
 * @author schen
 * @since 2024-06-24 23:29
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != val) {
                nums[slowIndex++] = nums[fastIndex];
            }
        }
        // 返回个数
        return slowIndex;
    }

}
