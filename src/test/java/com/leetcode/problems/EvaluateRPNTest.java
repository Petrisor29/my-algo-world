package com.leetcode.problems;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvaluateRPNTest {

    @Test
    public void testSimpleAdditionAndMultiplication() {
        EvaluateRPN solution = new EvaluateRPN();
        // ((2 + 1) * 3) = 9
        String[] tokens = {"2","1","+","3","*"};
        assertEquals(9, solution.evalRPN(tokens));
    }

    @Test
    public void testDivision() {
        EvaluateRPN solution = new EvaluateRPN();
        // (4 + (13 / 5)) = 6
        String[] tokens = {"4","13","5","/","+"};
        assertEquals(6, solution.evalRPN(tokens));
    }

    @Test
    public void testComplexExpression() {
        EvaluateRPN solution = new EvaluateRPN();
        // ((10 * (6 / ((9 + 3) * -11))) + 17) + 5 = 22
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        assertEquals(22, solution.evalRPN(tokens));
    }
}
