package com.balaji;

/**
 * Created by gokul on 1/10/17.
 */
public class SamplePractise {
    public static void main(String [] args){
        /*String s="19 may 2017";
        System.out.println(countNumOfDigits(s));*/
        System.out.println(findSum(123));
    }
    public static int findSum(int num){
        int result=0;
        int count=0;
        int a=0;
        while (num>0) {
            a = num % 10;
            num = num / 10;
            count++;
            int i = 0;
            int pow=1;
            while (i < count) {
                pow = pow * a;
                i++;
            }
            result = result + pow;
        }
        return result;
    }

    public static int countNumOfDigits(String s){
        int count=0;
        for (int i = 0; i <s.length() ; i++) {
            for (int j = 48; j <58; j++) {
                if (s.charAt(i)==j)
                    count++;
            }
        }
        return count;
    }

   /* public static int[] notAlone(int[] nums, int val){
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]==val)
                (nums[i-1]>nums[i+1])?nums[i]=nums[i-1]:nums[i]=nums[i+1];
        }
        return nums;
    }*/

}
