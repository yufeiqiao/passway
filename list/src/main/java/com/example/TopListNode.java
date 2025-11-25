package com.example;

public class TopListNode {
    int num;
    TopListNode next;

    public TopListNode(int n) {
        this.num = n;
        this.next = null;
    }

    public TopListNode(int n, TopListNode next) {
        this.num = n;
        this.next = next;
    }

    public void insert(int n) {
        this.next = new TopListNode(n, this.next);
    }

    public String print() {
        StringBuilder str = new StringBuilder();
        TopListNode node = this;
        while (node != null) {
            str.append(node.num);
            if (node.next != null) {
                str.append(" -> ");
            }
            node = node.next;
        }
        // str.append("\n");
        return str.toString();
    }
}
