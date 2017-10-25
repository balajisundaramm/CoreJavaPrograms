package com.ExceptionLab.UttaraEx;

/**
 * Created by Balaji on 25/10/17.
 */
public class AIOOBExPro1 {
    public static void main(String[] args) {
        try {
            int[] a = new int[3];
            System.out.println(args[3]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }
        System.out.println("Main ending successfully...");
    }
}
