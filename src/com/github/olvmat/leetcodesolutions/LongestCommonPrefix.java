package com.github.olvmat.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

// This is a revised version of the challenge. Please refer to the commit history to see the original solution.
public class LongestCommonPrefix {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("flower", "flow", "flight"));
        System.out.println(longestCommonPrefix(strings));
    }

    public static String longestCommonPrefix(List<String> strings) {
        String prefix = strings.getFirst();
        for (int i = 1; i < strings.size(); i++) {
            while (strings.get(i).indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
