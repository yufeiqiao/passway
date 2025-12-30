package com.example;

import java.util.ArrayDeque;
import java.util.Deque;

// leetcode 2390, stack
public class Solution {
    public String removeStars(String s) {

        Deque<Character> stack = new ArrayDeque<>();
        char[] src = s.toCharArray();

        for (char c : src) {
            if (c != '*') {
                stack.push(c);
            } else {
                stack.pop();
            }
        }

        StringBuilder res = new StringBuilder();
        for (char cc : stack) {
            res.append(cc);
        }

        return res.reverse().toString();
    }
}