package com.OnlineCoding;

import java.util.Scanner;

/**
 * Created by Balaji on 25/10/17.
 */

/*
Reverse digits of an integer.
Example1: x = 123, return 321
Example2: x = -123, return -321
*/

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        int n1=scanner.nextInt();
        System.out.println(reverse(n1));

        /*int x=-123;
        System.out.println(reverse(x));*/
    }
    public static int reverse(int x){
        long l=0;
        int num=(x<0)?x*(-1):x;
            while (num>0){
                int temp=num%10;
                num=num/10;
                l=(l*10)+temp;
            }
            int result=(int)l;
        return(l>(-1>>>1))?0:(x<0)?result*(-1):result;


    }

}
