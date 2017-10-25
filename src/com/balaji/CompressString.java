package com.balaji;

/**
 * Created by Balaji on 5/10/17.
 */
public class CompressString {
    public static void main(String[] args) {
        String s="aaaaqqaaccccc";
        System.out.println(compressString(s));
    }
    public static String compressString(String s) {
        int count=1;
        String temp="";
        for (int i = 0; i <s.length()-1 ; i++) {
            if (s.charAt(i)==s.charAt(i+1))
                count++;
            else {
                temp = temp + s.charAt(i) + count;
                count = 1;
            }
        }
     temp=temp+s.charAt(s.length()-1)+count;
        return temp;
    }
}
