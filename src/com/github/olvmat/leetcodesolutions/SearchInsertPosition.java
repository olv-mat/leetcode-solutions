package com.github.olvmat.leetcodesolutions;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 5;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        int length = nums.length;
        if (length < 1) return 0;

        for (int i = 0; i < length; i++) {
            if (nums[i] >= target) return i;
        }
        return length;
    }
}
