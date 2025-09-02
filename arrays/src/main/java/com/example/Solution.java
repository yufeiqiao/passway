package com.example;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    public String reverseVowels(String s) {
        if (s.length() <= 1) {
            return s;
        }

        char[] letters = s.toCharArray();
        String vowels = "aeiouAEIOU";
        Deque<Character> toReverse = new ArrayDeque<>();

        for (char c : letters) {
            if (vowels.contains(c + "")) {
                toReverse.push(c);
            }
        }

        for (int i = 0; i < letters.length; i++) {
            if (vowels.contains(letters[i] + "")) {
                letters[i] = toReverse.pop();
            }
        }

        return String.valueOf(letters);
    }

    /*
     * reverse all the vowel letter
     */
    public String basicReverseVowels(String s) {
        if (s.length() <= 1) {
            return s;
        }
        char[] letters = s.toCharArray();
        String vowels = "aeiouAEIOU";
        int[] positions = new int[letters.length];

        for (int i = 0; i < letters.length; i++) {
            if (vowels.contains(letters[i] + "")) {
                positions[i] = 1;
            } else {
                positions[i] = 0;
            }
        }

        int left = 0;
        int right = letters.length - 1;
        do {
            while (positions[left] == 0 && left < right) {
                left++;
            }
            while (positions[right] == 0 && left < right) {
                right--;
            }

            char temp = letters[left];
            letters[left++] = letters[right];
            letters[right--] = temp;
        } while (left < right);

        return String.valueOf(letters);
    }

    public String reverseWords(String s) {

        String[] splits = s.split(" ");
        Deque<String> words = new ArrayDeque<>();

        for (String split : splits) {
            if (split.length() >= 1) {
                words.push(split);
            }
        }

        return String.join(" ", words);
    }

}