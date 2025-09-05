package com.example;

import java.util.Arrays;

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

    // leetcode 1679, medium
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int count = 0;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == k) {
                left++;
                right--;
                count++;
            } else if (sum < k) {
                left++;
                continue;
            } else {
                right--;
                continue;
            }
        }
        return count;
    }

    // leetcode 643, easy
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxSum = sum;
        for (int i = k; i < nums.length; i++) {
            sum += nums[i] - nums[i - k];
            maxSum = (sum < maxSum) ? maxSum : sum;
        }

        return maxSum / k;
    }

}
