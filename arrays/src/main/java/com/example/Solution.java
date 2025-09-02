package com.example;

public class Solution {
    /*
     * reverse all the vowel letter
     */
    public String reverseVowels(String s) {
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
}