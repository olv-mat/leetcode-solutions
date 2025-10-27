package com.github.olvmat.leetcodesolutions;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        List<Integer> mergedList = mergeTwoLists(
                new LinkedList<>(List.of(1, 2, 3)),
                new LinkedList<>(List.of(1, 3, 4)));
        System.out.println(mergedList);
    }

    public static List<Integer> mergeTwoLists(
            List<Integer> firstList,
            List<Integer> secondList
    ) {
        LinkedList<Integer> mergedList = new LinkedList<>();
        mergedList.addAll(firstList);
        mergedList.addAll(secondList);
        Collections.sort(mergedList);
        return mergedList;
    }
}
