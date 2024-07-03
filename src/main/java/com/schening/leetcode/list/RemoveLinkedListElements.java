package com.schening.leetcode.list;

import com.schening.leetcode.list.strcut.ListNode;

/**
 * 203. 移除链表元素
 *
 * @author schening
 * @since 2024-07-03 21:56
 */
public class RemoveLinkedListElements {

    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1, head);
        ListNode preNode = dummy;
        ListNode curNode = head;
        while (curNode != null) {
            if (curNode.val == val) {
                preNode.next = curNode.next;
            } else {
                preNode = curNode;
            }
            curNode = curNode.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();
        ListNode head = ListNode.of(new int[]{1,2,6,3,4,5,6});
        ListNode result = removeLinkedListElements.removeElements(head, 6);
        System.out.println(result);
    }

}
