package com.balaji;

import java.util.Scanner;

/**
 * Created by gokul on 30/9/17.
 */
public class Minimum {
    public static void main(String[] args){
        int [] arr={10,-6,76,235,45};
        System.out.println(findMin(arr));

    }
    public static int findMin(int[] arr){
        int min=arr[0];
        for (int i = 0; i <arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }
        return min;
    }
}
