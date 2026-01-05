package com.leetcode.problems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ShuffleTheArrayTest {

    @Test
    public void testExample1() {
        ShuffleTheArray solution = new ShuffleTheArray();
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        int[] expected = {2, 3, 5, 4, 1, 7};
        
        assertArrayEquals(expected, solution.shuffle(nums, n));
    }

    @Test
    public void testExample2() {
        ShuffleTheArray solution = new ShuffleTheArray();
        int[] nums = {1, 2, 3, 4, 4, 3, 2, 1};
        int n = 4;
        int[] expected = {1, 4, 2, 3, 3, 2, 4, 1};
        
        assertArrayEquals(expected, solution.shuffle(nums, n));
    }

    @Test
    public void testExample3() {
        ShuffleTheArray solution = new ShuffleTheArray();
        int[] nums = {1, 1, 2, 2};
        int n = 2;
        int[] expected = {1, 2, 1, 2};
        
        assertArrayEquals(expected, solution.shuffle(nums, n));
    }
}
