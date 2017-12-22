package com.recursive;

/**
 * Created by Balaji on 6/11/17.
 */
public class Sum {
    public static void main(String[] args) {
        int value=0;
        System.out.println(recursive_Sum(value));
    }
    public static long recursive_Sum(int value) {
        long sum=0;
        if (value==0){
            //sum=sum+1;
            return 0;
        }
        sum=value+recursive_Sum(value-1);
        return sum;
    }

    public static long method2(int value) {
        if (value>0){
            return value+method2(value-1);
        }
        return 0;

    }
}
