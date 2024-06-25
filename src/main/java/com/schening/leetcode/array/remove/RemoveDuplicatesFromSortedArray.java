package com.schening.leetcode.array.remove;

/**
 * 27. 移除元素
 *
 * @author schen
 * @since 2024-06-24 23:29
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (nums[fastIndex] != nums[slowIndex]) {
                slowIndex++;
                nums[slowIndex] = nums[fastIndex];
            }
        }
        return slowIndex + 1;
    }

}
