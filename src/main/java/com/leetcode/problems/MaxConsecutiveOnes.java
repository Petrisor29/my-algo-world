package com.leetcode.problems;

/**
 * Problem: 485. Max Consecutive Ones
 * Link: https://leetcode.com/problems/max-consecutive-ones/
 * Difficulty: Easy
 *
 * Time Complexity: O(n) - Trecem prin array o singura data.
 * Space Complexity: O(1) - Folosim doar variabile pentru numarare.
 */
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_count = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1){
                count++;
                max_count = Math.max(count, max_count);  
            } else {
                count = 0;
            }
        }
        return max_count;
    }
}
