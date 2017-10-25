package com.balaji;

/**
 * Created by gokul on 28/9/17.
 */
public class EenFirstOddLast {
    public static void main(String[] args){
        int[] nums={1,2,3,4,5};
        for (int x:evenOdd(nums)) {
            System.out.println(x);
        }
    }
    public static int[] evenOdd(int[] nums) {
        int[] result=new int[nums.length];
        int a=0;
        int z=nums.length-1;
        for (int i=0;i<nums.length;i++) {
            if (nums[i] % 2 == 0)
                result[a++] = nums[i];
        }
        for (int i=0;i<nums.length;i++){
                if (nums[i]%2!=0)
                    result[a++]=nums[i];
        }
        return result;
    }
}
