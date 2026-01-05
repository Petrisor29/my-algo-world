package com.leetcode.problems;

/**
 * Problem: 1470. Shuffle the Array
 * Link: https://leetcode.com/problems/shuffle-the-array/
 * Difficulty: Easy
 *
 * Time Complexity: O(n) - Parcurgem jumatate din array o singura data.
 * Space Complexity: O(n) - Cream un array nou pentru rezultat.
 */
public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int k = 0;

        for(int i = 0; i < n; i++){
            ans[k] = nums[i];      // x elements
            ans[k + 1] = nums[n + i]; // y elements
            k = k + 2;
        }

        return ans;
    }
}
