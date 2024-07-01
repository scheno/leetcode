package com.schening.leetcode.array.remove;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode76. 最小覆盖子串
 *
 * @author shenchen
 * @since 2024/7/1 11:38
 */
public class MinimumWindowSubstring {

    public String minWindow(String s, String t) {
        String ans = "";
        int len = Integer.MAX_VALUE;

        Map<Character, Integer> m = new HashMap<>();
        Map<Character, Integer> n = new HashMap<>();
        for (char c : t.toCharArray()) {
            n.put(c, n.getOrDefault(c, 0) + 1);
        }
        int start = 0;

        for (int end = start; end < s.length(); end++) {
            char c = s.charAt(end);
            m.put(c, m.getOrDefault(c, 0) + 1);

            while (start <= end) {
                if (isSatisfied(m, n, s, end)) {
                    if (len >= end - start + 1) {
                        len = end - start + 1;
                        ans = s.substring(start, end + 1);
                    }
                } else {
                    break;
                }
                m.put(s.charAt(start), m.get(s.charAt(start)) - 1);
                start++;
            }
        }

        return ans;
    }

    private boolean isSatisfied(Map<Character, Integer> m, Map<Character, Integer> n, String s, int end) {
        if (!n.containsKey(s.charAt(end))) {
            return false;
        }
        for (char c : n.keySet()) {
            if (!m.containsKey(c)) {
                return false;
            }
            if (n.get(c) > m.get(c)) {
                return false;
            }
        }
        return true;
    }

}
