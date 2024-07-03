package com.schening.leetcode.list.strcut;

/**
 * ListNode
 *
 * @author schening
 * @since 2024-07-03 21:56
 */
public class ListNode {
    public int val;
    public ListNode prev;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int val, ListNode prev, ListNode next) {
        this.val = val;
        this.prev = prev;
        this.next = next;
    }

    public static ListNode of(int[] vals) {
        if (vals == null || vals.length == 0) {
            return null;
        }
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        for (int val : vals) {
            ListNode next = new ListNode(val);
            cur.next = next;
            cur = next;
        }
        return dummy.next;
    }
}
