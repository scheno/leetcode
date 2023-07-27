package com.schening.leetcode.linkedlist;

import com.schening.leetcode.ListNode;

/**
 * LeetCode2.两数相加
 *
 * @author schening
 * @since 2023-07-27 22:03
 */
public class LeetCode2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int mul = 0;
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        while (l1 != null || l2 != null) {
            int sum = mul;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            mul = sum / 10;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
        }

        if (mul == 1) {
            tail.next = new ListNode(1);
        }
        return dummy.next;
    }


}
