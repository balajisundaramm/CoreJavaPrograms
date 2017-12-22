package com.balaji;

import java.util.Scanner;

/**
 * Created by Balaji on 28/10/17.
 */
public class has77Problem122 {
    public static void main(String[] args) {
        int a=1;
        while (a!=0){
            System.out.println("Enter the size of the array");
            Scanner scanner=new Scanner(System.in);
            int [] nums= new int[scanner.nextInt()];
            for (int i = 0; i <nums.length ; i++) {
                System.out.println("Enter the elements of the array");
                scanner=new Scanner(System.in);
                nums[i]=scanner.nextInt();
            }
            System.out.println(has77(nums));
            System.out.println("Enter 1 to continue or 0 to exit");
            scanner=new Scanner(System.in);
            a=scanner.nextInt();
        }
    }

    public static boolean has77(int[] nums) {
        for (int i = 0; i <nums.length-2 ; i++) {
            if (nums[i]==7 && (nums[i+1]==7 || nums[i+2]==7))
                return true;
        }
        return false;
    }
}
