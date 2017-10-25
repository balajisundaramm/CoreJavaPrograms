package com.balaji;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Balaji on 8/10/17.
 */
public class StringPermutation {
    public static void main(String[] args) {
        String s1="uttara";
        String s2="tturaa";
        System.out.println(isStringPermute(s1, s2));
    }
    public static boolean isStringPermute(String s1, String s2){
        // Method 1


        /*String r1="";
        char[] c1=s1.toCharArray();
        Arrays.sort(c1);
        for (char c:c1) {
            r1=r1+c;
        }

        String r2="";
        char[] c2=s2.toCharArray();
        Arrays.sort(c2);
        for (char c:c2) {
            r2=r2+c;
        }
        return (r1.equals(r2));*/


        //method 2

        char[] c1=s1.toCharArray();
        Arrays.sort(c1);
        char[] c2=s2.toCharArray();
        Arrays.sort(c2);
        return (Arrays.equals(c1,c2));
    }
}
