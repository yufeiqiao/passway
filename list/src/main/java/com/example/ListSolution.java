package com.example;

public class ListSolution {

    // leetcode 328
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode left = head, right, rightStart, node = head;
        boolean isOdd = true;

        // size 1
        if (head.next == null) {
            return head;
        }
        // size 2
        if (head.next.next == null) {
            return head;
        }

        right = head.next;
        rightStart = right;
        node = head.next.next;

        while (node != null) {
            if (isOdd) {
                left.next = node;
                left = left.next;
                isOdd = false;
            } else {
                right.next = node;
                right = right.next;
                isOdd = true;
            }
            node = node.next;
        }

        right.next = null;
        left.next = rightStart;
        return head;
    }
}
