package com.example;

public class Main {
    public static void main(String[] args) {

        int[][] records = new int[][] { { 1, 91 }, { 1, 92 }, { 2, 93 }, { 2, 97 }, { 1, 60 }, { 2, 77 }, { 1, 65 },
                { 1, 87 }, { 1, 100 }, { 2, 100 }, { 2, 76 } };

        Solution sol = new Solution();
        // sol.highFive(records);
        for (int[] r : sol.highFive(records)) {
            System.out.println(r[0] + ", " + r[1]);
        }

    }
}