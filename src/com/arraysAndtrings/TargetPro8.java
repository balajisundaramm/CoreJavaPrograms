package com.arraysAndtrings;

/**
 * Created by Balaji on 29/11/17.
 */
public class TargetPro8 {
    public static void main(String[] args) {
        int[] a={1,3,6,7,9};
        int target=9;
        for (int i:target(a,target)) {
            System.out.println(i);
        }
    }

    public static int[] target(int[] a, int num) {
        int first=a[0];
        int last=a[1];
        int search=num;
        for (int i = 0; i <a.length-1 ; i++) {
            first=i;
            search=num-a[i];
            for (int j = 0; j <a.length ; j++) {
                if (a[j]==search)
                    last=j;
            }
        }
        int[] result={first ,last};
        return result;
    }
}
