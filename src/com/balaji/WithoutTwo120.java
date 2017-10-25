package com.balaji;

/**
 * Created by Balaji on 25/10/17.
 */

/*
Given a string, if a length 2 substring appears at both its beginning and end,
return a string without the substring at the beginning, so "HelloHe"
yields "lloHe Otherwise, return the original string unchanged.
*/

public class WithoutTwo120 {
    public static void main(String[] args) {
        String str="HiHi";
        System.out.println(without2(str));
    }
    public static String without2(String str) {
        String s1=str.substring(0,2);
        String s2=str.substring(str.length()-2);
        if (s1.equals(s2))
            return str.substring(2);
        return str;
    }

}
