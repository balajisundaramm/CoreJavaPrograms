package com.balaji;

import java.util.Scanner;

/**
 * Created by gokul on 28/9/17.
 */
public class Make3ZeroFollowed2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num of elements in array :");
        int h=sc.nextInt();
        int[] y=new int[h];
        for (int i = 1; i <y.length+1 ; i++) {
            System.out.println("Enter the element " + i +" = ");
            y[i-1] = sc.nextInt();
        }
        for (int x :y) {
            System.out.println(x);
        }
        int[] p=fix23(y);
        System.out.println("The modified array is ");
        for(int f:p)
        {
            System.out.println(f);
        }



    }
    public static int[] fix23(int[] nums) {
        int result []=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=3)
                result[i]=nums[i];
            else {
                if (nums[i - 1] != 2)
                    result[i] = nums[i];
                else
                    result[i] = 0;
            }

        }
        return result;
    }
}
