package com.example;

public class Main {
    public static void main(String[] args) {

        TopListNode node = new TopListNode(0);
        node.next = new TopListNode(3);
        node.insert(2);
        node.insert(1);
        System.out.println(node.print());

        TopList list = new TopList(4, new int[] { 5, 7, 11, 5, 0, 7, 1 });
        System.out.println(list.print());
        System.out.println(list.getLength());
        System.out.println(list.size());
        System.out.println(list.getMax());
        System.out.println(list.getMin());
        System.out.println(list.getAverage());

        int[][] records = new int[][] { { 1, 91 }, { 1, 92 }, { 2, 93 }, { 2, 97 }, { 1, 60 }, { 2, 77 }, { 1, 65 },
                { 1, 87 }, { 1, 100 }, { 2, 100 }, { 2, 76 } };

        Solution sol = new Solution();
        // sol.highFive(records);
        for (int[] r : sol.highFive(records)) {
            System.out.println(r[0] + ", " + r[1]);
        }

    }
}