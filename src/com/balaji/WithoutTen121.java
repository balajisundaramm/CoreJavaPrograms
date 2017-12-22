package com.balaji;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Balaji on 31/10/17.
 */
public class WithoutTen121 {
    public static void main(String[] args) {
        int x = 1;
        Scanner scanner = new Scanner(System.in);
        while (x != 0) {
            System.out.println("Enter the size of the array");
            int[] nums = new int[scanner.nextInt()];
            for (int i = 0; i < nums.length; i++) {
                System.out.println("Enter the elements of array");
                nums[i] = scanner.nextInt();
            }
            for (int i:withoutTen(nums)){
                System.out.println(i);
            }
        }
    }
    public static int[] withoutTen(int[] nums) {
        int[] result=new int[nums.length];
        int count=0;
        List<Integer> list=new ArrayList<Integer>();
        for (int i:nums) {
            if (i!=10)
                list.add(i);
        }
        for (Object o:list) {
            result[count++]=(Integer)o;
        }
        return result;
    }
}
