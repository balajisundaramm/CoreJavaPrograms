package com.balaji;

/**
 * Created by Balaji on 12/10/17.
 */
public class Printing1To10 {
    public static void main(String[] args) {
        //recursiveFun(1);
        int n=10;
        System.out.println("\"hi\"");
        System.out.println("\nhi");
        System.out.println("hi");

    }

    public static void recursiveFun(int num) {
        if(num<=10){
            System.out.println(num);
            recursiveFun(num+1);
        }

    }
}
