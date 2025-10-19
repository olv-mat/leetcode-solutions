package com.github.olvmat.leetcodesolutions;

import java.util.ArrayList;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int windowSize = 2;
        int windowSum = 0;

        ArrayList<Integer> output = new ArrayList<>();

        for (int i = 0; i < windowSize; i++) {
            output.add(i);
            windowSum += nums[i];
        }
        if (windowSum != target) {
            for (int i = windowSize; i < nums.length; i++) {
                int outgoingIndex = i - windowSize;
                output.removeFirst();
                output.add(i);
                windowSum += nums[i] - nums[outgoingIndex];
                if (windowSum == target) {
                    return;
                }
            }
        }
        System.out.println(output);
    }
}
