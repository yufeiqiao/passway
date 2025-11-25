package com.example;

public class TopList {
    private TopListNode head;
    private final int size;
    private int length;
    private int min;

    public TopList(int size) {
        this.size = size;
        this.length = 0;
    }

    public TopList(int size, int head) {
        this(size);
        this.add(head);
    }

    public TopList(int size, int[] nums) {
        this(size);
        for (int num : nums) {
            this.add(num);
        }
    }

    public void add(int num) {
        if (this.length == 0) {
            this.head = new TopListNode(num);
            this.length++;
            this.min = this.head.num;
            return;
        } else {
            if (num >= this.head.num) {
                this.head = new TopListNode(num, this.head);
                this.trim();
                return;
            }
            TopListNode node = this.head;
            while (node.next != null) {
                if (num >= node.next.num) {
                    break;
                }
                node = node.next;
            }
            node.insert(num);
            this.trim();
            return;
        }
    }

    private void trim() {
        this.length = 0;
        TopListNode node = this.head;
        while (node != null) {
            this.length++;
            if (this.length == this.size) {
                node.next = null;
            }
            this.min = node.num;
            node = node.next;
        }
    }

    public String print() {
        if (this.length <= 0) {
            return "";
        } else {
            return this.head.print();
        }
    }

    public int size() {
        return this.size;
    }

    public int getLength() {
        return this.length;
    }

    public int getMax() {
        return this.head.num;
    }

    public int getMin() {
        return this.min;
    }

    public int getAverage() {
        TopListNode node = this.head;
        int sum = 0;
        while (node != null) {
            sum += node.num;
            node = node.next;
        }

        return sum / this.length;
    }

}
