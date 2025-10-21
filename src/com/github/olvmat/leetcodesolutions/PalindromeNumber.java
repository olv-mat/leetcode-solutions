package com.github.olvmat.leetcodesolutions;

import java.util.Stack;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        Stack<Character> stack = new Stack<>();

        String originalNumber = String.valueOf(x);
        String reversedNumber = "";
        for (char item: originalNumber.toCharArray()) {
            stack.push(item);
        }

        int originalStackSize = stack.size();
        for (int i = 0; i < originalStackSize; i++) {
            reversedNumber += stack.peek();
            stack.pop();
        }

        return originalNumber.equals(reversedNumber);
    }
}
