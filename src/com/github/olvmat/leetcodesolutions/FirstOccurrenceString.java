package com.github.olvmat.leetcodesolutions;

public class FirstOccurrenceString {
    public static void main(String[] args) {
        System.out.println(firstOccurrenceString(
                "leetcode", "leeto"));
    }

    public static int firstOccurrenceString(
            String haystack, String needle) {
        int windowLength = needle.length();
        int haystackLength = haystack.length();
        if (windowLength > haystackLength) return -1;

        StringBuilder window = new StringBuilder();
        window.append(haystack, 0, windowLength);
        if (window.toString().equals(needle)) return 0;

        for (int i = windowLength; i < haystackLength; i++) {
            window.deleteCharAt(0);
            window.append(haystack.charAt(i));
            if (window.toString().equals(needle)) return (i - windowLength) + 1;
        }

        return -1;
    }
}
