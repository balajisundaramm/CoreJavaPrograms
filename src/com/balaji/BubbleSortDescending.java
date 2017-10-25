package com.balaji;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by gokul on 6/10/17.
 */
public class BubbleSortDescending {
    public static void main(String[] args) {
        int[] arr={2,6,5,4,8,3,9};
        System.out.println("Array before sorting");
        for (int x:arr) {
            System.out.print("["+x+" "+"]");
        }
        System.out.println("Array after sorting in descending order");
        for (int y:bubbleSortDescend(arr)) {
            System.out.print("["+y+" "+"]");
        }

    }
    public static int[] bubbleSortDescend(int[] arr) {
        int z=0;
        while(z<arr.length){
            for (int i = 1; i <arr.length; i++) {
                int max=arr[i-1];
                if (max<arr[i]){
                    max=max+arr[i];
                    arr[i]=max-arr[i];
                    max=max-arr[i];
                    arr[i-1]=max;
                }
            }
            z++;
        }
        return arr;
    }
}
