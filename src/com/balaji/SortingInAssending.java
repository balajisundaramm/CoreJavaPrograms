package com.balaji;

/**
 * Created by gokul on 1/10/17.
 */
public class SortingInAssending {
    public static void main(String[] args){
        int[] arr={10,62,54,34,75,9};
        for (int x:sortArray(arr)) {
            System.out.println(x);
        }
    }
    public static int[] sortArray(int[] arr){
        int[] result=new int[arr.length];
        int min=arr[0];
        int a=0;
        for (int j = 0; j <arr.length ; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (min > arr[i])
                    min = arr[i];
            }
            result[a++] = min;
        }

        return result;
    }
}
