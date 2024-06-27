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
            int i = 0;
            int j = 0;
            if (s.charAt(sLast) == '#') {
                i = 1;
                while (i > 0) {
                    if (s.charAt(sLast--) != '#') {
                        i--;
                    } else {
                        i++;
                    }
                }
            }
            if (t.charAt(tLast) == '#') {
                j = 1;
                while (j > 0) {
                    if (t.charAt(tLast--) != '#') {
                        j--;
                    } else {
                        j++;
                    }
                }
            }
            if (sLast == -1 && tLast == -1) {
                return true;
            }
            if (s.charAt(sLast--) != t.charAt(tLast--)) {
                return false;
            }
        }

        return sLast == tLast;
    }

    public static void main(String[] args) {
        BackspaceStringCompare bsc = new BackspaceStringCompare();
        System.out.println(bsc.backspaceCompare("bxj##tw", "bxo#j##tw"));
        System.out.println(bsc.backspaceCompare("b#c", "d"));
    }

}
