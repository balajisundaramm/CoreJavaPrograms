package com.arraysAndtrings;

/**
 * Created by Balaji on 29/11/17.
 */
public class TrippleUpPro2 {
    public static void main(String[] args) {
        int[] arr={1,2,4};
        System.out.println(trippleUp(arr));
    }

    public static boolean trippleUp(int[] arr) {
        boolean flag=false;
        for (int i = 0; i <arr.length-2 ; i++) {
            if ((arr[i]+1)==arr[i+1] && (arr[i]+2)==arr[i+2]){
                flag=true;
            }
        }
        return flag;
    }
}

