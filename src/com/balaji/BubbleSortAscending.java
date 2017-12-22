package com.balaji;

/**
 * Created by gokul on 6/10/17.
 */
public class BubbleSortAscending {
    public static void main(String[] args) {
        int [] arr={5,2,8,9,3,6,4,23};
        for (int y:arr) {
            System.out.print(y+" ");
        }
        System.out.println();
        for (int x:bubbleSort(arr)) {
            System.out.print(x+" ");
        }

        int index=(binarySearch(arr,0,arr.length,23));
        System.out.println((index!=-1)?index:"the no not found in the array");
        index=bin(arr,0,arr.length,23);
        System.out.println((index!=-1)?index:"the no not found in the array");
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

    public static int binarySearch(int[] arr,int start,int end, int key) {
        int[] sorted=bubbleSort(arr);
        int mid=(start+end)/2;
        if (start>=end){
            return -1;
        }
        else if(arr[mid]<key){
            return binarySearch(arr,mid+1,end,key);
        }
        else if (arr[mid]>key){
            return binarySearch(arr,start,mid-1,key);
        }
        else if(arr[mid]==key){
            return mid+1;
        }
        return -1;
    }

    public static int bin(int[] arr, int start,int end,int key) {
        int mid=(start+end)/2;
        while (start<=end) {
            if (start >= end) {
                return -1;
            }
            else if (key<arr[mid]){
                end=mid-1;
            }
            else if (key>arr[mid]){
                start=mid+1;
            }
            else {
                return mid+1;
            }
            mid=(start+end)/2;
        }
        return -1;
    }
}
