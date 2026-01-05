package com.leetcode.problems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxConsecutiveOnesTest {

    @Test
    public void testExample1() {
        MaxConsecutiveOnes solution = new MaxConsecutiveOnes();
        int[] nums = {1, 1, 0, 1, 1, 1};
        // Primii doi de 1, apoi zero, apoi trei de 1. Maximul e 3.
        assertEquals(3, solution.findMaxConsecutiveOnes(nums));
    }

    @Test
    public void testExample2() {
        MaxConsecutiveOnes solution = new MaxConsecutiveOnes();
        int[] nums = {1, 0, 1, 1, 0, 1};
        assertEquals(2, solution.findMaxConsecutiveOnes(nums));
    }
    
    @Test
    public void testAllZeros() {
        MaxConsecutiveOnes solution = new MaxConsecutiveOnes();
        int[] nums = {0, 0, 0};
        assertEquals(0, solution.findMaxConsecutiveOnes(nums));
    }
}
