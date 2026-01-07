package com.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem: 448. Find All Numbers Disappeared in an Array
 * Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 * Difficulty: Easy
 *
 * Time Complexity: O(n)
 * Space Complexity: O(n) - Folosim un array boolean 'seen'.
 */
public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] seen = new boolean[nums.length + 1];
        List<Integer> result = new ArrayList<>();

        for(int n : nums) {
            seen[n] = true;
        }
        
        for(int i = 1; i <= nums.length; i++) {
            if(!seen[i]) {
                result.add(i);
            }
        }

        return result;
    }
}
