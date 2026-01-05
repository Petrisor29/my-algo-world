package com.leetcode.problems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ConcatenationOfArrayTest {

    @Test
    public void testExample1() {
        ConcatenationOfArray solution = new ConcatenationOfArray();
        int[] nums = {1, 2, 1};
        int[] expected = {1, 2, 1, 1, 2, 1};
        
        assertArrayEquals(expected, solution.getConcatenation(nums));
    }

    @Test
    public void testExample2() {
        ConcatenationOfArray solution = new ConcatenationOfArray();
        int[] nums = {1, 3, 2, 1};
        int[] expected = {1, 3, 2, 1, 1, 3, 2, 1};
        
        assertArrayEquals(expected, solution.getConcatenation(nums));
    }
}
