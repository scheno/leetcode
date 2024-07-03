package com.schening.leetcode.list;

import com.schening.leetcode.list.strcut.ListNode;

/**
 * 707. 设计链表
 *
 * @author schening
 * @since 2024-07-03 22:27
 */
public class DesignLinkedList {

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.addAtHead(7);
        list.addAtHead(2);
        list.addAtHead(1);
        list.addAtIndex(3, 0);
        list.deleteAtIndex(2);
        list.addAtHead(6);
        list.addAtTail(4);
        list.get(4);
        list.addAtHead(4);
        list.addAtIndex(5, 0);
        list.addAtHead(6);
    }

    static class MyLinkedList {

        private ListNode head;
        private ListNode tail;
        private int size = 0;

        public MyLinkedList() {
            head = new ListNode();
            tail = new ListNode();
            head.next = tail;
            tail.prev = head;
        }

        public int get(int index) {
            if (index < 0 || index > size - 1) {
                return -1;
            }
            int curIndex = 0;
            ListNode curNode = head;
            ListNode targetNode = null;
            while (curIndex <= index) {
                if (curIndex == index) {
                    targetNode = curNode.next;
                }
                curIndex++;
                curNode = curNode.next;
            }
            return targetNode.val;
        }

        public void addAtHead(int val) {
            ListNode node = new ListNode(val);
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
            size++;
        }

        public void addAtTail(int val) {
            ListNode node = new ListNode(val);
            node.next = tail;
            node.prev = tail.prev;
            tail.prev.next =node;
            tail.prev = node;
            size++;
        }

        public void addAtIndex(int index, int val) {
            if (index < 0 || index > size) {
                return;
            }
            if (index == 0) {
                addAtHead(val);
                return;
            }
            if (index == size) {
                addAtTail(val);
                return;
            }
            int curIndex = 0;
            ListNode node = new ListNode(val);
            ListNode curNode = head;
            while (curIndex <= index) {
                if (curIndex == index) {
                    node.prev = curNode;
                    node.next = curNode.next;
                    curNode.next.prev = node;
                    curNode.next = node;
                }
                curIndex++;
                curNode = curNode.next;
            }
            size++;
        }

        public void deleteAtIndex(int index) {
            if (index < 0 || index > size - 1) {
                return;
            }
            int curIndex = 0;
            ListNode curNode = head;
            while (curIndex <= index) {
                if (curIndex == index) {
                    curNode.next = curNode.next.next;
                    curNode.next.prev = curNode;
                }
                curIndex++;
                curNode = curNode.next;
            }
            size--;
        }
    }

}
