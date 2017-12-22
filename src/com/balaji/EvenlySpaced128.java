package com.balaji;

import java.lang.*;

/**
 * Created by Balaji on 31/10/17.
 */
public class EvenlySpaced128 {
    public static void main(String[] args) {
        int a=2;
        int b=6;
        int c=4;
        System.out.println(evenlySpaced(a,b,c));

    }
    public static boolean evenlySpaced(int a, int b, int c) {
        int diff1= java.lang.Math.abs(a-b);
        int diff2= java.lang.Math.abs(b-c);
        return (diff1==diff2 || diff1==(2*diff2) || (2*diff1)==diff2);
    }
    //Method 2
    public boolean evenlySpaced2(int a, int b, int c) {
        double d=(a+b+c)/3.0;
        if(d==0.0+a||d==0.0+b||d==0.0+c)
            return true;
        else
            return false;
    }
}
