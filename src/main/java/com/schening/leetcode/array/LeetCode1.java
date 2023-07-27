package com.schening.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode1.两数之和
 *
 * @author schening
 * @since 2023-07-27 22:03
 */
public class LeetCode1 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < nums.length; i++) {
            Integer index = map.get(target - nums[i]);
            if (index != null) {
                return new int[] {i, index};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] {-1, -1};
    }

}
