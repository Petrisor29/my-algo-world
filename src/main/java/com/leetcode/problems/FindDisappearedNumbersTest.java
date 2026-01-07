package com.leetcode.problems;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindDisappearedNumbersTest {

    @Test
    public void testExample1() {
        FindDisappearedNumbers solution = new FindDisappearedNumbers();
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        // Numerele care lipsesc sunt 5 si 6
        List<Integer> expected = Arrays.asList(5, 6);
        
        assertEquals(expected, solution.findDisappearedNumbers(nums));
    }

    @Test
    public void testExample2() {
        FindDisappearedNumbers solution = new FindDisappearedNumbers();
        int[] nums = {1, 1};
        // N=2, avem {1, 1}, deci lipseste 2
        List<Integer> expected = Arrays.asList(2);
        
        assertEquals(expected, solution.findDisappearedNumbers(nums));
    }
}
