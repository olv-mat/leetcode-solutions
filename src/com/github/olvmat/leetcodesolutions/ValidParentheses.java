package com.github.olvmat.leetcodesolutions;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("([)]"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> openingReference = new HashMap<>();
        openingReference.put(')', '(');
        openingReference.put(']', '[');
        openingReference.put('}', '{');

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            boolean isClosing = openingReference.containsKey(currentChar);
            if (i == 0 && isClosing) return false;
            if (!isClosing) {
                stack.push(currentChar);
            } else {
                char peek = stack.peek();
                char correctOpening = openingReference.get(currentChar);
                if (peek != correctOpening) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
