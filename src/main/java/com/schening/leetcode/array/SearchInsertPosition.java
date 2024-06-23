package com.schening.leetcode.array;

/**
 * 35. 搜索插入位置
 *
 * @author schen
 * @since 2024-06-27 23:19
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            }
        }
        return end + 1;
    }

}
