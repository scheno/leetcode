package com.schening.leetcode.list.reverse;

import com.schening.leetcode.list.strcut.ListNode;

/**
 * 206. 反转链表
 *
 * @author schening
 * @since 2024-07-04 23:01
 */
public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {
        ListNode temp = null;
        ListNode prev = null;
        ListNode cur = head;
        while(cur != null) {
            temp = cur.next;
            cur.next = prev;
            prev =cur;
            cur = temp;
        }
        return prev;
    }

}
