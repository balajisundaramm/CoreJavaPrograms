package com.arraysAndtrings;

/**
 * Created by Balaji on 29/11/17.
 */
public class Unlucky13Pro1 {
    public static void main(String[] args) {
       int[] arr={};
        System.out.println(sumOfArray(arr));
    }

    public static int sumOfArray(int[] arr) {
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]!=13){
                sum=sum+arr[i];
            }
        }
        return (arr.length==0)?0:sum;

    }
}
