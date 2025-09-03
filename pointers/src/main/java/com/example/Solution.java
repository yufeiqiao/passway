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

        return false;
    }

}
