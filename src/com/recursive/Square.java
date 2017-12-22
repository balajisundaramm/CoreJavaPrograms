package com.recursive;

/**
 * Created by Balaji on 7/11/17.
 */
public class Square {
    public static void main(String[] args) {
        int n=5;
        System.out.println(square(n));
    }
    public static long square(int n){
        int count=1;
        long res=0;
        if (count==n)
            return n;
        else {
            count++;
            res =res+n + square(n);
            return res;
        }
    }
}

