package com.github.olvmat.leetcodesolutions;

import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        HashMap<String, Integer> romanNumerals = getRomanNumerals();

        StringBuilder numeralGroup = new StringBuilder();
        char[] numerals = s.toCharArray();
        int sum = 0;
        for (char numeral : numerals) {
            int numeralGroupLength = numeralGroup.length();
            if (numeralGroupLength == 0) {
                if (numeral == 'I' || numeral == 'X' || numeral == 'C') {
                    numeralGroup.append(numeral);
                } else {
                    sum += romanNumerals.get(String.valueOf(numeral));
                }
            } else if (numeralGroupLength == 1) {
                switch (numeralGroup.toString()) {
                    case "I":
                        if (numeral == 'V' || numeral == 'X') {
                            numeralGroup.append(numeral);
                        }
                        if (numeral == 'I') {
                            sum += romanNumerals.get(String.valueOf(numeral));
                        }
                        break;
                    case "X":
                        if (numeral == 'L' || numeral == 'C') {
                            numeralGroup.append(numeral);
                        }
                        break;
                    case "C":
                        if (numeral == 'D' || numeral == 'M') {
                            numeralGroup.append(numeral);
                        }
                        break;
                }
                sum += romanNumerals.get(numeralGroup.toString());
                numeralGroup = new StringBuilder();
            }
        }
        if (!numeralGroup.isEmpty()) {
            sum += romanNumerals.get(numeralGroup.toString());
        }
        return sum;
    }

    private static HashMap<String, Integer> getRomanNumerals() {
        HashMap<String, Integer> romanNumerals = new HashMap<>();
        romanNumerals.put("I", 1);
        romanNumerals.put("IV", 4);
        romanNumerals.put("V", 5);
        romanNumerals.put("IX", 9);
        romanNumerals.put("X", 10);
        romanNumerals.put("XL", 40);
        romanNumerals.put("L", 50);
        romanNumerals.put("XC", 90);
        romanNumerals.put("C", 100);
        romanNumerals.put("CD", 400);
        romanNumerals.put("D", 500);
        romanNumerals.put("CM", 900);
        romanNumerals.put("M", 1000);
        return romanNumerals;
    }
}
