package com.example;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;

public class Solution {

    // leetcode 2390, stack
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

    // leetcode 735, stack
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int a : asteroids) {
            stack = collide(stack, a);
        }

        int[] res = new int[stack.size()];
        int i = 0;
        for (Iterator<Integer> it = stack.descendingIterator(); it.hasNext();) {
            res[i++] = it.next();
        }
        return res;
    }

    public Deque<Integer> collide(Deque<Integer> stack, int asteroid) {
        if (asteroid >= 0 || stack.peek() == null || stack.peek() < 0) {
            stack.push(asteroid);
            return stack;
        }

        // at here : asteroid < 0
        // stack top not null and >= 0
        if (asteroid + stack.peek() > 0) {
            return stack;
        } else if (asteroid + stack.peek() == 0) {
            stack.pop();
            return stack;
        } else {
            stack.pop();
            return collide(stack, asteroid);
        }
    }
}