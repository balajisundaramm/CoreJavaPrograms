package com.balaji;

/**
 * Created by Balaji on 24/10/17.
 */
public class TwoTwo {
    public static void main(String[] args) {
        int [] nums={1,2,2,5,4};
        System.out.println(twoTwo(nums));
    }
    public static boolean twoTwo(int[] nums) {
        int count2=0;
        int countRepeated2=0;
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==2)
                count2++;
        }
        for (int i = 0; i <nums.length-1 ; i++) {
            if(nums[i]==2 && nums[i+1]==2)
                countRepeated2++;
        }
        return (count2==1)?false:(count2==countRepeated2+1);
    }
}
