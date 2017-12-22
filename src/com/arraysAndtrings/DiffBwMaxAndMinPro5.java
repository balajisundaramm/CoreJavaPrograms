package com.arraysAndtrings;

/**
 * Created by Balaji on 29/11/17.
 */
public class DiffBwMaxAndMinPro5 {
    public static void main(String[] args) {
        int[] a={1,2,10,8};
        System.out.println(diffExceptMaxAndMin(a));
    }

    public static int diff(int[] a) {
        int max=a[0];
        int min=a[0];
        for (int i = 0; i <a.length-1 ; i++) {
            int temp1=(int)Math.max(a[i],a[i+1]);
            max=(max<temp1)?temp1:max;
            int temp2=(int)Math.min(a[i],a[i+1]);
            min=(min>temp2)?temp2:min;
        }
        return max-min;
    }

    public static int diffExceptMaxAndMin(int[] a){
        int max=a[0];
        int sum=0;
        int min=a[0];
        for (int i = 0; i <a.length-1 ; i++) {
            int temp1=(int)Math.max(a[i],a[i+1]);
            max=(max<temp1)?temp1:max;
            int temp2=(int)Math.min(a[i],a[i+1]);
            min=(min>temp2)?temp2:min;
        }
        for (int i:a) {
            sum=sum+i;
        }
        System.out.println(sum);
        System.out.println(max);
        System.out.println(min);
        return ((sum-max-min)/(a.length-2));
    }
}
