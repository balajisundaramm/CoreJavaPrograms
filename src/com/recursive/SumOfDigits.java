package com.recursive;

/**
 * Created by Balaji on 7/11/17.
 */
public class SumOfDigits {
    public static void main(String[] args) {
        int number=4;
        System.out.println(recursUp(number));
    }
    public static long recursive_sumOfDigits(int number){
        if (number/10==0)
            return number;
        return (number%10+recursive_sumOfDigits(number/10));
    }
    public static String recursUp(int begin_value){
        return (begin_value<15)?(begin_value+" "+recursUp(begin_value+1)):"15";
    }

}
