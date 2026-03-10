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

    // leetcode 394, passed, mar 10 2026
    public String decodeString(String s) {
        Deque<String> stack = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                if (sb.length() > 0) {
                    stack.push(sb.toString());
                    sb.setLength(0);
                }

                int j = s.substring(i).indexOf('[') + i;
                stack.push(s.substring(i, j));

                i = j;
            } else if (s.charAt(i) == ']') {
                if (sb.length() > 0) {
                    stack.push(sb.toString());
                    sb.setLength(0);
                }

                while (!Character.isDigit(stack.peek().charAt(0))) {
                    sb.insert(0, stack.pop());
                }
                int count = Integer.parseInt(stack.pop());

                while (count-- > 0) {
                    stack.push(sb.toString());
                }
                sb.setLength(0);
            } else {
                sb.append(s.charAt(i));
            }
        }
        if (sb.length() > 0) {
            stack.push(sb.toString());
        }
        sb.setLength(0);

        while (stack.peek() != null) {
            sb.insert(0, stack.pop());
        }

        return sb.toString();
    }

}