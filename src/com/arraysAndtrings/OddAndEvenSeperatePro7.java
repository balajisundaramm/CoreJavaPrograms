package com.arraysAndtrings;

/**
 * Created by Balaji on 29/11/17.
 */
public class OddAndEvenSeperatePro7 {
    public static void main(String[] args) {
        int[] a={2,5,6,1,8};
        for (int i:oddAndEven(a)) {
            System.out.println(i);
        }
    }

    public static int[] oddAndEven(int[] a) {
        int[] result=new int[a.length];
        int index=0;
        for (int i = 0; i <a.length ; i++) {
            if ((a[i]&1)==0)
                result[index++]=a[i];
        }
        for (int i = 0; i <a.length ; i++) {
            if ((a[i]&1)!=0)
                result[index++]=a[i];
        }
        return result;
    }
}
