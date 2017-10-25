package com.OnlineCoding;

import java.util.Arrays;

/**
 * Created by Balaji on 22/10/17.
 */

/*
Question:
There are two sorted arrays nums1 and nums2.
Find the median of the two sorted arrays.
Example:
nums1 = [1, 2]
nums2 = [3, 4]
The median is (2 + 3)/2 = 2.5 (or) (1+4)/2 = 2.5
*/


public class MedianOfSortedArrays {
    public static void main(String[] args) {
        int[] nums1={};
        int[] nums2={5,12,25,34};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] result=new int[nums1.length+nums2.length];
        int index=0;
        for (int i = 0; i <nums1.length ; i++) {
            result[index++]=nums1[i];
        }
        for (int j = 0; j <nums2.length ; j++) {
            result[index++]=nums2[j];
        }
        Arrays.sort(result);
        int midind=result.length/2;
        return ((result.length%2)==0)?((result[midind-1]+result[midind+1-1])/2.0):result[midind+1-1];
    }
}
