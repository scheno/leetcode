package com.schening.leetcode.linkedlist;

import com.schening.leetcode.ListNode;

/**
 * LeetCode206.翻转链表
 *
 * 时间复杂度：O(N)
 *
 * 题解：定义一个空的 pre 节点，没遍历一个节点，将当前节点的 next 节点保存下来，将当前节点的 next 指向 pre 节点，将 pre 节点 设为 current，
 * 最后设置 current 为 tmp
 *
 * @author schening
 * @since 2023/7/21 22:45
 */
public class LeetCode206 {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode current = head, pre = null;
        while (current != null) {
            ListNode tmp = current.next;
            current.next = pre;
            pre = current;
            current = tmp;
        }
        return pre;
    }

}
