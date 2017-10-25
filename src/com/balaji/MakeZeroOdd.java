package com.balaji;

/**
 * Created by gokul on 4/10/17.
 */
public class MakeZeroOdd {
    public static void main(String[] args) {
        int[] nums={1,0,7,0,5,0};
        for (int x:zeroMax(nums)) {
            System.out.println(x);
        }

    }

    public static int[] zeroMax(int[] nums) {
        for (int i = 0; i <nums.length-1; i++) {
            if (nums[i]==0){
                int bigOdd=0;
                for (int j = i; j <nums.length ; j++) {
                    if (bigOdd<nums[j] && nums[j]%2!=0) {
                        bigOdd = nums[j];
                        nums[i] = bigOdd;
                    }
                }
            }
        }
        return nums;
    }
}
