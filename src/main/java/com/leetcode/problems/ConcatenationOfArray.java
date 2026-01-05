package com.leetcode.problems;

/**
 * Problem: 1929. Concatenation of Array
 * Link: https://leetcode.com/problems/concatenation-of-array/
 * Difficulty: Easy
 *
 * Time Complexity: O(n) - Parcurgem array-ul o singura data.
 * Space Complexity: O(n) - Cream un array nou de dimensiune dubla.
 */
public class ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2 * nums.length];

        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[i];
            ans[nums.length + i] = nums[i];
        }

        return ans;
    }
}
