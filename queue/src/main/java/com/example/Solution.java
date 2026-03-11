package com.example;

public class Solution {

    public int[] recentCounter(int[] pingSequence) {
        int[] res = new int[pingSequence.length];

        RecentCounter obj = new RecentCounter();

        for (int i = 0; i < res.length; i++) {
            res[i] = obj.ping(pingSequence[i]);
        }

        return res;
    }

}
