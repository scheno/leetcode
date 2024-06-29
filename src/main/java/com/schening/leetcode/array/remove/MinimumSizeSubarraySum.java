package com.schening.leetcode.array.remove;

/**
 * 977. 有序数组的平方
 *
 * @author schening
 * @since 2024-06-27 22:59
 */
public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int start = 0;
        int result = Integer.MAX_VALUE;
        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];
            while (sum >= target && start < end) {
                result = Math.min(result, end - start + 1);
                sum -= nums[start];
                start++;
            }
        }
        return result;
    }

}
