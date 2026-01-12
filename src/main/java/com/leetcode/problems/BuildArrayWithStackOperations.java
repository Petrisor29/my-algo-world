package com.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem: 1441. Build an Array With Stack Operations
 * Link: https://leetcode.com/problems/build-an-array-with-stack-operations/
 * Difficulty: Medium
 *
 * Time Complexity: O(n) - Iteram pana la n (sau pana terminam target-ul).
 * Space Complexity: O(n) - Folosim o lista pentru simularea stivei.
 */
public class BuildArrayWithStackOperations {
    public List<String> buildArray(int[] target, int n) {
        List<Integer> stack = new ArrayList<>();
        List<String> ans = new ArrayList<>();
        int iterator = 0;

        for(int i = 1; i <= n; i++) {
            stack.add(i);
            ans.add("Push");
            
            if(stack.get(iterator) == target[iterator]){
                iterator++;
            } else if(stack.get(iterator) != target[iterator] && !stack.isEmpty()) {
                ans.add("Pop");
                stack.remove(stack.get(iterator));
            }
            
            if(iterator == target.length) {
                break;
            }
        }

        return ans;
    }
}
