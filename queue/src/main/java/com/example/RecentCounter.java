package com.example;

import java.util.ArrayDeque;
import java.util.Queue;

class RecentCounter {
    Queue<Integer> recentCalls;
    final static int recentTime = 3000;
    int cutOff;
    int size;

    public RecentCounter() {
        recentCalls = new ArrayDeque<>();
        this.size = 0;
        setCutOff(0);
    }

    private void setCutOff(int t) {
        cutOff = t - recentTime;
        update();
    }

    private int getCutOff() {
        return cutOff;
    }

    private int getSize() {
        return size;
    }

    private void update() {
        if (recentCalls.peek() == null) {
            return;
        }
        while (recentCalls.peek() < getCutOff()) {
            recentCalls.poll();
        }
        size = recentCalls.size();
    }

    public int ping(int t) {
        recentCalls.offer(t);
        setCutOff(t);
        return getSize();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */