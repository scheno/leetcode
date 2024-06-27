package com.schening.leetcode.array.remove;

/**
 * 844. 比较含退格的字符串
 *
 * @author schen
 * @since 2024-06-26 23:58
 */
public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        int sLast = s.length() - 1;
        int tLast = t.length() - 1;
        while (sLast >= 0 || tLast >= 0) {
            sLast = getNextValidCharIndex(s, sLast);
            tLast = getNextValidCharIndex(t, tLast);

            if (sLast == -1 && tLast == -1) {
                return true;
            }
            if (sLast == -1 || tLast == -1) {
                return false;
            }
            if (s.charAt(sLast--) != t.charAt(tLast--)) {
                return false;
            }
        }

        return true;
    }

    private int getNextValidCharIndex(String s, int index) {
        int skip = 0;
        while (index >= 0) {
            if (s.charAt(index) == '#') {
                skip++;
            } else if (skip > 0) {
                skip--;
            } else {
                break;
            }
            index--;
        }
        return index;
    }

}
