package com.schening.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode3.无重复字符的最长子串
 *
 * 时间复杂度：O(N)
 *
 * 题解：使用 Map 记录每个元素的位置，当出现重复元素时，将 start 置为上个重复元素的下个元素
 * 当输入参数为 abba 时，走到第二个 a 时，map.get(c) + 1 为 1，比当前 start 要小，所以要对 start 和 元素的出现位置进行比较
 *
 * @author schening
 * @since 2023/7/21 22:45
 */
public class LeetCode3 {

    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int start = 0, end = 0, ans = 0;
        for (; end < s.length(); end++) {
            char c = s.charAt(end);
            if (map.containsKey(c)) {
                start = Math.max(start, map.get(c) + 1);
            }
            map.put(c, end);
            ans = Math.max(ans, end - start + 1);
        }
        return ans;
    }
    
}
