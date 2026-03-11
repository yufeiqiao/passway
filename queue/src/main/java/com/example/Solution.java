package com.example;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {

    public int[] recentCounter(int[] pingSequence) {
        int[] res = new int[pingSequence.length];

        RecentCounter obj = new RecentCounter();

        for (int i = 0; i < res.length; i++) {
            res[i] = obj.ping(pingSequence[i]);
        }

        return res;
    }

    public String predictPartyVictory(String senate) {
        Queue<Character> voting = new ArrayDeque<>();
        int rCount = 0, dCount = 0;
        int banNextR = 0, banNextD = 0;

        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                rCount++;
            } else {
                dCount++;
            }
            voting.offer(senate.charAt(i));
        }

        while (voting.peek() != null) {
            char seat = voting.poll();

            // ban check
            if ((banNextD > 0) && (seat == 'D')) {
                dCount--;
                banNextD--;
                continue;
            } else if ((banNextR > 0) && (seat == 'R')) {
                rCount--;
                banNextR--;
                continue;
            }

            // win check
            if ((seat == 'R') && (dCount == 0)) {
                return "Radiant";
            } else if ((seat == 'D') && (rCount == 0)) {
                return "Dire";
            }

            // ban next opposite side senate
            if (seat == 'R') {
                banNextD++;
            } else {
                banNextR++;
            }

            // push to the back
            voting.offer(seat);
        }

        return "";
    }
}
