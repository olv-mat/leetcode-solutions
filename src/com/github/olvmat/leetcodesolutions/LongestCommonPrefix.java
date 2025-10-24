package com.github.olvmat.leetcodesolutions;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        List<String> stringsList = getStringsList();
        String commonPrefix = longestCommonPrefix(stringsList);
        System.out.println("Common Prefix: " + commonPrefix);
    }

    public static String longestCommonPrefix(List<String> strings) {
        StringBuilder commonPrefix = new StringBuilder();
        for (int i = 0; i < strings.size(); i++) {
            String currentWord = strings.get(i);
            int currentWordLength = currentWord.length();
            int commonPrefixLength = commonPrefix.length();
            if (i == 0) {
                commonPrefix.append(currentWord);
            } else {
                if (commonPrefixLength > currentWordLength) {
                    commonPrefix.delete(currentWordLength, commonPrefixLength);
                }
                int foundCharacters = 0;
                for (char character : currentWord.toCharArray()) {
                    String stringCharacter = String.valueOf(character);
                    int commonPrefixIndex = commonPrefix.indexOf(stringCharacter);
                    if (commonPrefixIndex == -1) {
                        commonPrefix.delete(foundCharacters, commonPrefixLength);
                    } else {
                        foundCharacters ++;
                    }
                }
            }
        }
        return commonPrefix.toString();
    }

    public static List<String> getStringsList() {
        List<String> strings = new ArrayList<>();
        strings.add("flower");
        strings.add("flow");
        strings.add("flight");
        return strings;
    }
}
