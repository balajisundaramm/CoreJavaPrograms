package com.balaji;

/**
 * Created by Balaji on 11/10/17.
 */
public class SameEnds113 {
    public static void main(String[] args) {
        int nums[] = {1, 2, 5, 1, 2};
        int len = 1;
        System.out.println(sameEnds(nums, len));
    }

    public static boolean sameEnds(int[] nums, int len) {
        for (int i = 0; i < len; i++) {
            if (nums[i] == nums[nums.length - len + i])
                return true;
        }
        return false;
    }

}
