package com.github.olvmat.leetcodesolutions;

import java.util.LinkedList;
import java.util.List;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(nums);
        System.out.println(k);
    }

    public static int removeDuplicates(int[] nums) {
        List<Integer> uniqueValues = new LinkedList<>();
        for (int num : nums) {
            if (!uniqueValues.contains(num)) {
                uniqueValues.add(num);
            }
        }
        System.out.println(uniqueValues);
        return uniqueValues.size();
    }
}
