package com.balaji;

import java.util.Scanner;

/**
 * Created by Balaji on 1/11/17.
 */
public class AlternativeNumbers109 {
    public static void main(String[] args) {
        int x=1;
        Scanner scanner = new Scanner(System.in);
        while (x!=0) {
           System.out.println("Enter the size of the array");
            int[] nums =new int[scanner.nextInt()];
            for (int i = 0; i <nums.length ; i++) {
                System.out.println("Enter the elements of the int array");
                nums[i]=scanner.nextInt();
            }
            System.out.println("Enter the everywhere int value");
            int val=scanner.nextInt();
            System.out.println(isEverywhere(nums,val));

            System.out.println("Enter 1 to continue or 0 to exit");
            scanner = new Scanner(System.in);
            x = scanner.nextInt();
        }
    }

    public static boolean isEverywhere(int[] nums, int val) {
        boolean flag=false;
        for (int i = 0; i <nums.length-2 ; i++) {
            if (nums[i]==val && nums[i+2]==val) {
                flag = true;
                i=i+1;
            }
        }
        return flag;
    }
}
