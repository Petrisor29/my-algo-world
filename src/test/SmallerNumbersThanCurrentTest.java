package com.leetcode.problems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SmallerNumbersThanCurrentTest {

    @Test
    public void testExample1() {
        SmallerNumbersThanCurrent solution = new SmallerNumbersThanCurrent();
        int[] nums = {8, 1, 2, 2, 3};
        int[] expected = {4, 0, 1, 1, 3};
        assertArrayEquals(expected, solution.smallerNumbersThanCurrent(nums));
    }

    @Test
    public void testExample2() {
        SmallerNumbersThanCurrent solution = new SmallerNumbersThanCurrent();
        int[] nums = {6, 5, 4, 8};
        int[] expected = {2, 1, 0, 3};
        assertArrayEquals(expected, solution.smallerNumbersThanCurrent(nums));
    }

    @Test
    public void testExample3() {
        SmallerNumbersThanCurrent solution = new SmallerNumbersThanCurrent();
        int[] nums = {7, 7, 7, 7};
        int[] expected = {0, 0, 0, 0};
        assertArrayEquals(expected, solution.smallerNumbersThanCurrent(nums));
    }
}
