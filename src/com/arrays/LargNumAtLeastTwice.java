package com.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LargNumAtLeastTwice {
    public static void main(String[] args) {
        int[] nums1 = {3, 6, 1, 0};
        int[] nums2 = {1, 2, 3, 4};

        System.out.println(dominantIndex(nums1));
        System.out.println(dominantIndex(nums2));
    }

    public static int dominantIndex(int[] nums) {
        Map<Integer, Integer> mapp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            mapp.put(nums[i], i);
        }
        Arrays.sort(nums);
        int result = 0;
        int secondLast = nums[nums.length - 2];
        int last = nums[nums.length - 1];
        if (last >= secondLast * 2) {
            result = mapp.get(last);
        } else {
            result = -1;
        }

        return result;
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }
}
