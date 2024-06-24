package com.schening.leetcode.array;

/**
 * 367. 有效的完全平方数
 *
 * @author schen
 * @since 2024-06-23 23:52
 */
public class ValidPerfectSquare {

    public boolean isPerfectSquare(int num) {
        int left = 1; int right = num;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid == num) {
                return true;
            } else if ((long) mid * mid < num) {
                left = mid + 1;
            } else if ((long) mid * mid > num) {
                right = mid - 1;
            }
        }
        return false;
    }

}
