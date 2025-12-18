package com.example;

import java.util.HashMap;
import java.util.Map;

// leetcode 1086
class Solution {
    public int[][] highFive(int[][] items) {
        Map<Integer, TopList> record = new HashMap<>();

        for (int[] entry : items) {
            if (record.containsKey(entry[0])) {
                record.get(entry[0]).add(entry[1]);
            } else {
                record.put(entry[0], new TopList(5, entry[1]));
            }
        }

        int[][] averages = new int[record.size()][2];
        int i = 0;
        for (Map.Entry<Integer, TopList> score : record.entrySet()) {
            averages[i][0] = score.getKey();
            averages[i][1] = score.getValue().getAverage();
            i++;
        }

        return averages;
    }

    class TopList {
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

        class TopListNode {
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

    }

}
