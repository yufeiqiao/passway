package com.example;

import java.util.HashMap;
import java.util.Map;

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

}
