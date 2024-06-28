package com.schening.leetcode.array.remove;

/**
 * LeetCode209. 长度最小的子数组
 *
 * @author schening
 * @since 2024/6/28 09:49
 */
public class MinimumSizeSubarraySum {

    public int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int sum = 0;
        int length = Integer.MAX_VALUE;

        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];

            while (sum >= target) {
                length = Math.min(length, end - start + 1);
                sum -= nums[start++];
            }
        }

        return length == Integer.MAX_VALUE ? 0 : length;
    }

}
