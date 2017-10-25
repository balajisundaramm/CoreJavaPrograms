package com.balaji;

import java.util.Scanner;

/**
 * Created by gokul on 28/9/17.
 */
public class ZeroFront {
    public static void main(String[] args){
        System.out.println("Enter the array");
        //Scanner scanner=new Scanner(System.in);
        int [] nums={1,5,0,2,0,0,7};
        for (int x:zeroFront(nums)) {
           System.out.println(x);
            //scanner.nextInt(x);
        }

    }
    public static int[] zeroFront(int[] nums){
        int[] result=new int[nums.length];
        int a=0;
        for (int x:nums) {
            if (x==0)
                result[a++]=x;
        }
        for (int x:nums) {
            if (x!=0)
                result[a++]=x;
        }
        return result;
    }
}
