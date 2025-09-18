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

    public int[] productExceptSelf(int[] nums) {

        int[] leftProduct = new int[nums.length];
        leftProduct[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
        }

        int[] rightProduct = new int[nums.length];
        rightProduct[nums.length - 1] = 1;
        for (int j = nums.length - 2; j >= 0; j--) {
            rightProduct[j] = rightProduct[j + 1] * nums[j + 1];
        }

        int[] product = new int[nums.length];
        for (int k = 0; k < nums.length; k++) {
            product[k] = leftProduct[k] * rightProduct[k];
        }

        return product;
    }

    public boolean increasingTriplet(int[] nums) {
        int size = nums.length;
        if (size < 3) {
            return false;
        }

        int[] leftMin = new int[size];
        leftMin[0] = nums[0];
        for (int i = 1; i < size; i++) {
            leftMin[i] = (leftMin[i - 1] < nums[i]) ? leftMin[i - 1] : nums[i];
        }

        int[] rightMax = new int[size];
        rightMax[size - 1] = nums[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            rightMax[i] = (rightMax[i + 1] > nums[i]) ? rightMax[i + 1] : nums[i];
        }

        for (int i = 1; i < size - 1; i++) {
            if (nums[i] > leftMin[i] && nums[i] < rightMax[i]) {
                return true;
            }
        }
        return false;
    }

    public int compress(char[] chars) {
        if (chars.length == 1) {
            return 1;
        }
        int write = 0;
        char last = chars[0];
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == last) {
                count++;
                if (i == chars.length - 1) {
                    chars[write++] = last;
                    write = writeNum(chars, count, write);
                }
            } else {
                // new char, now write last
                chars[write++] = last;
                last = chars[i];
                if (count > 1) {
                    write = writeNum(chars, count, write);
                    count = 1;
                }
                if (i == chars.length - 1) {
                    chars[write++] = chars[i];
                }
            }
        }
        return write;
    }

    private int writeNum(char[] chars, int count, int start) {
        char[] num = Integer.valueOf(count).toString().toCharArray();
        for (char c : num) {
            chars[start++] = c;
        }
        return start;
    }

    // leetcode 1732
    public int largestAltitude(int[] gain) {
        int[] altitude = new int[gain.length + 1];
        int maxAlt = 0;
        altitude[0] = 0;
        for (int i = 1; i < altitude.length; i++) {
            altitude[i] = altitude[i - 1] + gain[i - 1];
            maxAlt = (maxAlt > altitude[i]) ? maxAlt : altitude[i];
        }
        return maxAlt;
    }

    // leetcode 724
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        int left = 0;
        int right = sum;
        for (int i = 0; i < nums.length; i++) {
            left = (i == 0) ? 0 : left + nums[i - 1];
            right -= nums[i];

            if (left == right) {
                return i;
            }
        }
        return -1;
    }
}