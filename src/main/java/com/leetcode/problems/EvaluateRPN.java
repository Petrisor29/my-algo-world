package com.leetcode.problems;

import java.util.Stack;

/**
 * Problem: 150. Evaluate Reverse Polish Notation
 * Link: https://leetcode.com/problems/evaluate-reverse-polish-notation/
 * Difficulty: Medium
 *
 * Time Complexity: O(n) - Parcurgem lista de token-uri o singura data.
 * Space Complexity: O(n) - In cel mai rau caz, stiva contine toate numerele.
 */
public class EvaluateRPN {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String token : tokens){
            if(isOperator(token)){
                int b = stack.pop();
                int a = stack.pop();
                // Ordinea conteaza: a (operator) b. Ex: a - b
                int result = applyOp(token, a , b);
                stack.push(result); 
            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop(); 
    }

    private boolean isOperator(String s) {
        return s.equals("-") || s.equals("+") || s.equals("*") || s.equals("/");
    }

    private int applyOp(String op, int a, int b) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
            default: return 0;
        }
    }
}
