package com.leetcode.problems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SetMismatchTest {

    @Test
    public void testExample1() {
        SetMismatch solution = new SetMismatch();
        int[] nums = {1, 2, 2, 4};
        // 2 e duplicat, 3 lipseste
        int[] expected = {2, 3};
        
        assertArrayEquals(expected, solution.findErrorNums(nums));
    }

    @Test
    public void testExample2() {
        SetMismatch solution = new SetMismatch();
        int[] nums = {1, 1};
        // 1 e duplicat, 2 lipseste
        int[] expected = {1, 2};
        
        assertArrayEquals(expected, solution.findErrorNums(nums));
    }

    @Test
    public void testUnsorted() {
        SetMismatch solution = new SetMismatch();
        int[] nums = {3, 2, 3, 4, 6, 5}; // n=6, lipseste 1
        int[] expected = {3, 1};
        
        assertArrayEquals(expected, solution.findErrorNums(nums));
    }
}
