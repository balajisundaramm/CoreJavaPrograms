package com.interiewQuestions;

/**
 * Created by Balaji on 4/11/17.
 */
public class CompressString {
    public static void main(String[] args) {
        String s="aaaabbccc";
        System.out.println(compressString(s));
    }
    public static String compressString(String s) {
        int count=1;
        String temp="";
        for (int i = 0; i <s.length()-1 ; i++) {
            if (s.charAt(i)==s.charAt(i+1))
                count++;
            else {
                temp = temp+count+s.charAt(i);
                count = 1;
            }
        }
        temp=temp+count+s.charAt(s.length()-1);
        return temp;
    }
}
