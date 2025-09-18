package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Solution {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        Set<Integer> overlap = new HashSet<>();
        for (int n : nums1) {
            set1.add(n);
        }

        for (int n : nums2) {
            if (set1.contains(n)) {
                overlap.add(n);
            } else {
                set2.add(n);
            }
        }
        set1.removeAll(overlap);
        return new ArrayList<>(Arrays.asList(
                new ArrayList<>(set1),
                new ArrayList<>(set2)));
    }
}
