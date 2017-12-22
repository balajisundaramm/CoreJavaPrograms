package com.recursive;

/**
 * Created by Balaji on 7/11/17.
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        for (int x:reverseArray(a)) {
            System.out.println(x);
        }
    }
    public static int[] reverseArray(int[] x){
        int[] res=new int[x.length];
        int[] temp=new int[x.length-1];
        for (int i=0; i<x.length-1;i++) {

            temp[i]=x[i];
        }
        for (int i = 0; i <x.length ; i++) {
            if (temp.length==1)
                return temp;
            res[i]=x[x.length-1];
            reverseArray(temp);
        }
        return res;
    }

}
