package com.balaji;

import java.lang.*;
import java.lang.Math;
import java.util.Scanner;

/**
 * Created by Balaji on 31/10/17.
 */
public class BiggDiff107 {
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
            System.out.println(bigDiff(nums));

            System.out.println("Enter 1 to continue or 0 to exit");
            scanner = new Scanner(System.in);
            x = scanner.nextInt();
        }
    }
    public static int bigDiff(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        for (int i = 0; i <nums.length-1 ; i++) {
            int tempMax=java.lang.Math.max(nums[i],nums[i+1]);
            max=(max<tempMax)?tempMax:max;
            int tempMin= Math.min(nums[i],nums[i+1]);
            min=(min>tempMin)?tempMin:min;
        }
        return (max-min);
    }

}
