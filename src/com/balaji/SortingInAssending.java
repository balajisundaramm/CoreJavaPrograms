package com.balaji;

/**
 * Created by gokul on 1/10/17.
 */
public class SortingInAssending {
    public static void main(String[] args){
        int[] arr={10,62,54,34,75,9};
        for (int x:sort(arr)) {
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
    public static int[] sort(int[] arr){
        int num=0;
        while (num<arr.length) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    arr[i] = arr[i] ^ arr[i + 1];
                    arr[i + 1] = arr[i] ^ arr[i + 1];
                    arr[i] = arr[i] ^ arr[i + 1];
                }
            }
            num++;
        }
        return arr;
    }
}
