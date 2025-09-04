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

}
