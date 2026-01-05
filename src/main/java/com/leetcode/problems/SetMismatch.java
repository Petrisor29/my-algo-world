package com.leetcode.problems;

/**
 * Problem: 645. Set Mismatch
 * Link: https://leetcode.com/problems/set-mismatch/
 * Difficulty: Easy
 *
 * Time Complexity: O(n) - Parcurgem array-ul de doua ori.
 * Space Complexity: O(n) - Folosim un array boolean pentru a marca numerele vazute.
 */
public class SetMismatch {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        boolean[] seen = new boolean[nums.length + 1];

        // 1. Gasim duplicatul
        for (int num : nums) {
            if (seen[num]) {
                result[0] = num; // Acesta este duplicatul
            }
            seen[num] = true;
        }

        // 2. Gasim numarul lipsa (cel care a ramas false in array-ul seen)
        for (int i = 1; i <= nums.length; i++) {
            if (!seen[i]) {
                result[1] = i; // Acesta este numarul lipsa
                break;
            }
        }

        return result;
    }
}
