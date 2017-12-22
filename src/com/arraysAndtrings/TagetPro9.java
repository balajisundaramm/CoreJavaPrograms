package com.arraysAndtrings;

/**
 * Created by Balaji on 29/11/17.
 */
public class TagetPro9 {
    public static void main(String[] args) {
        int[] a={1,0,5,0};
        for (int i:nonZeroFirst(a)) {
            System.out.println(i);
        }
    }

    public static int[] nonZeroFirst(int[] a) {
        int[] result=new int[a.length];
        int index=0;
        for (int i = 0; i <a.length ; i++) {
            if (a[i]!=0)
                result[index++]=a[i];
        }
        return result;
    }
}
