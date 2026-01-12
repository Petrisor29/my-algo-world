package com.leetcode.problems;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuildArrayWithStackOperationsTest {

    @Test
    public void testExample1() {
        BuildArrayWithStackOperations solution = new BuildArrayWithStackOperations();
        int[] target = {1, 3};
        int n = 3;
        // 1 (Push), 2 (Push, Pop), 3 (Push)
        List<String> expected = Arrays.asList("Push", "Push", "Pop", "Push");
        
        assertEquals(expected, solution.buildArray(target, n));
    }

    @Test
    public void testExample2() {
        BuildArrayWithStackOperations solution = new BuildArrayWithStackOperations();
        int[] target = {1, 2, 3};
        int n = 3;
        // Se potrivesc toate direct
        List<String> expected = Arrays.asList("Push", "Push", "Push");
        
        assertEquals(expected, solution.buildArray(target, n));
    }

    @Test
    public void testExample3() {
        BuildArrayWithStackOperations solution = new BuildArrayWithStackOperations();
        int[] target = {1, 2};
        int n = 4;
        // Ne oprim cand am terminat target-ul, chiar daca n e 4
        List<String> expected = Arrays.asList("Push", "Push");
        
        assertEquals(expected, solution.buildArray(target, n));
    }
}
