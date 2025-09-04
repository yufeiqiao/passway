package com.example;

public class Solution {

    public void moveZeroes(int[] nums) {
        int write = 0;

        for (int n : nums) {
            if (n != 0) {
                nums[write++] = n;
            }
        }

        while (write < nums.length) {
            nums[write++] = 0;
        }

    }

    public boolean isSubsequence(String s, String t) {
        if (s.length() <= 0) {
            return true;
        }
        int pointer = 0;
        char[] ref = s.toCharArray();
        char[] seq = t.toCharArray();
        for (char c : seq) {
            if (c == ref[pointer]) {
                pointer++;
                if (pointer >= ref.length) {
                    return true;
                }
            }
        }
        return (pointer >= ref.length);
    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max = 0;

        while (left < right) {
            int width = right - left;
            int hgt = (height[left] < height[right]) ? height[left++] : height[right--];
            int area = width * hgt;
            max = (area < max) ? max : area;
        }

        return max;
    }

}
