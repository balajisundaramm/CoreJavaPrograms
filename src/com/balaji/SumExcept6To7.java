package com.balaji;

/**
 * Created by gokul on 28/9/17.
 */
public class SumExcept6To7 {
    public static void main(String[] args){
        int[] nums={1,5,6,8,7,4};
        System.out.println(sum67(nums));
    }
    public static int sum67(int[] nums){
        int sum=0;
        for (int i = 0; i <nums.length; i++) {
            if(nums[i]!=6)
                sum=sum+nums[i];
            else {
                if (nums[i] == 6 && nums[i + 1] != 7) {
                    nums[i + 1] = 6;
                    continue;
                }
                i++;
                continue;
            }
        }
        return sum;
    }

}
