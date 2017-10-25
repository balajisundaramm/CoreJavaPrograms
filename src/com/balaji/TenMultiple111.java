package com.balaji;

/**
 * Created by Balaji on 10/10/17.
 */
public class TenMultiple111 {
    public static void main(String[] args) {
        /*int[] nums={1,50,1,20,5,4,1};
        for (int x:tenRun(nums)) {
            System.out.println(x);
        }*/


    }
    public static int[] tenRun(int[] nums){
        for (int i = 0; i <nums.length-1 ; i++) {
            if(nums[i]%10==0 && nums[i+1]%10!=0)
                nums[i+1]=nums[i];
        }
        return nums;
    }

}
