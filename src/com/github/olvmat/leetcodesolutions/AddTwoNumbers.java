package com.github.olvmat.leetcodesolutions;

import java.util.LinkedList;
import java.util.List;

public class AddTwoNumbers {
    public static void main(String[] args) {
        System.out.println(addTwoNumbers(
                new LinkedList<>(List.of(9,9,9,9,9,9,9)),
                new LinkedList<>(List.of(9,9,9,9))
        ));
    }

    public static List<Integer> addTwoNumbers(
            List<Integer> l1, List<Integer> l2) {
        Integer sum = toInteger(l1) + toInteger(l2);
        return toReversedList(String.valueOf(sum));
    }

    public static Integer toInteger(List<Integer> list) {
        StringBuilder builder = new StringBuilder();
        for (Integer i: list.reversed()) {
            builder.append(i);
        }
        return Integer.valueOf(builder.toString());
    }

    public static List<Integer> toReversedList(String str) {
        List<Integer> list = new LinkedList<Integer>();
        for (Character character: str.toCharArray()) {
            list.add(Integer.parseInt(String.valueOf(character)));
        }
        return list.reversed();
    }
}
