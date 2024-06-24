package com.schening.leetcode.array;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 *
 * @author schen
 * @since 2024-06-23 22:39
 */
public class FindFirstAndLastPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {
        return new int[] {searchLeft(nums, target), searchRight(nums, target)};
    }

    public int searchLeft(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        boolean matched = false;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                right = mid - 1;
                matched = true;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return matched ? right + 1 : -1;
    }

    public int searchRight(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        boolean matched = false;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                left = mid + 1;
                matched = true;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        return matched ? left - 1 : -1;
    }

}
