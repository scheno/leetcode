package com.schening.leetcode.array;

/**
 * 69. x 的平方根
 *
 * @author schen
 * @since 2024-06-23 22:52
 */
public class Sqrtx {

    public int mySqrt(int x) {
        int left = 1; int right = x;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid == x) {
                return mid;
            } else if ((long) mid * mid < x) {
                left = mid + 1;
            } else if ((long) mid * mid > x) {
                right = mid - 1;
            }
        }
        return right;
    }

}
