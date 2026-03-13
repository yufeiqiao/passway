package com.example;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;

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

    // leetcode 206 reversed linked list
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        if (head.next == null) {
            return head;
        }

        Deque<ListNode> stack = new ArrayDeque<>();
        while (head != null) {
            ListNode node = head;
            head = head.next;
            node.next = null;
            stack.push(node);
        }

        head = stack.pop();
        ListNode node = head;

        while (stack.size() > 0) {
            node.next = stack.pop();
            node = node.next;
        }

        return head;
    }

    // leetcode 2130
    public int pairSum(ListNode head) {

        ListNode fast = head, slow = head;
        boolean flag = true;

        Deque<Integer> half = new ArrayDeque<>();

        while (fast != null) {
            if (flag) {
                half.push(slow.val);
                slow = slow.next;
            }

            flag = !flag;
            fast = fast.next;
        }

        int max = 0;
        while (slow != null) {
            int sum = slow.val + half.pop();
            max = (sum < max) ? max : sum;

            slow = slow.next;
        }

        return max;
    }
}
