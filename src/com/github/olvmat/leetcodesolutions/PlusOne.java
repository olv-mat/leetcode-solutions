package com.github.olvmat.leetcodesolutions;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {4,3,2,1};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] += 1;
            if (sum <= 9) {
                digits[i] = sum;
                return digits;
            } else {
                if (i > 0) digits[i] = 0;
            }
        }
        return digits;
    }
}
