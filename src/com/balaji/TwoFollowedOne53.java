package com.balaji;

/**
 * Created by gokul on 5/10/17.
 */
public class TwoFollowedOne53 {
    public static void main(String[] args) {
        int[] nums={2,1,5,4};
        System.out.println(has12(nums));
    }

    public static boolean has12(int[] nums) {
        for (int i = 0; i <nums.length-1 ; i++) {
            if (nums[i]==1){
                for (int j = i; j <nums.length; j++) {
                    if(nums[j]==2)
                        return true;
                }
            }

        }
        return false;
    }
}
