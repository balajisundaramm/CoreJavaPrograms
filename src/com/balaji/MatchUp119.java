package com.balaji;

/**
 * Created by Balaji on 24/10/17.
 */
public class MatchUp119 {
    public static void main(String[] args) {
        int[] nums1={1,2,5,8};
        int[] nums2={2,1,4,10};
        System.out.println(matchUp(nums1,nums2));
    }
    public static int matchUp(int[] nums1, int[] nums2)
    {
        int count=0;
        for (int i = 0; i <nums1.length ; i++) {
            if(nums1[i]-nums2[i]==2 || nums1[i]-nums2[i]==1 || nums1[i]-nums2[i]==-2 || nums1[i]-nums2[i]==-1)
                count++;
        }
        return count;
    }

}
