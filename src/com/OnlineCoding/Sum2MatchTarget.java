package com.OnlineCoding;

import java.util.Scanner;

/**
 * Created by Balaji on 22/10/17.
 */

/*
Question:
Given an array of integers, return indices of the two numbers such that
they add up to a specific target.
Example:
Given nums = [2, 7, 11, 15], target = 9
Because nums[0] + nums[1] = 2 + 7 = 9
return [0, 1].
*/
public class Sum2MatchTarget {
    public static void main(String[] args) {
        /*System.out.println("Enter the element of array");
        Scanner scanner=new Scanner(System.in);*/
        int [] nums={5,2,3,7,6};
        int target=12;
        for (int x:twoSum(nums,target)) {
            System.out.println(x);
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        int [] result=new int[2];
        for (int i = 0; i <nums.length-1 ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
    }
}
