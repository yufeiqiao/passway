package com.example;

import java.util.LinkedList;
import java.util.List;

public class ListNode {
    public int val;
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

    public ListNode next() {
        return next;
    }

    public int getVal() {
        return val;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public int[] toArray() {
        List<Integer> l = new LinkedList<>();
        ListNode n = this;
        while (n != null) {
            l.add(n.val);
            n = n.next;
        }

        int[] res = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            res[i] = l.get(i);
        }
        return res;
    }

    public static ListNode ListNodeFactory(int[] nums) {
        if (nums.length < 1) {
            return null;
        }
        ListNode head = new ListNode(nums[0]);

        ListNode node = head;
        for (int i = 1; i < nums.length; i++) {
            node.setNext(new ListNode(nums[i]));
            node = node.next;
        }

        return head;
    }
}
