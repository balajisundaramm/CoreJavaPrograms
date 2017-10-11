package com.balaji;

/**
 * Created by gokul on 6/10/17.
 */
public class BubbleSortAscending {
    public static void main(String[] args) {
        int [] arr={5,2,8,9,3,6,4,23};
        for (int y:arr) {
            System.out.println(y);
        }
        for (int x:bubbleSort(arr)) {
            System.out.print(x);
        }
    }
    public static int[] bubbleSort(int[] arr) {
        int z=0;
        while(z<arr.length) {
            for (int i = 1; i < arr.length; i++) {
                int min=arr[i-1];
                if (min > arr[i]) {
                    min = min+arr[i];
                    arr[i] = min-arr[i];
                    min= min-arr[i];
                    arr[i-1]=min;
                }
            }
            z++;
        }
        return arr;
    }
}
