package com.interiewQuestions;

/**
 * Created by Balaji on 4/11/17.
 */
public class StringReverse {
    public static void main(String[] args) {
        String s="I love India";
        System.out.println(printWordsLastToFirst(s));
    }

    public static String printWordsLastToFirst(String s) {
        String[] strings=s.split(" ");
        String res="";
        for (int i=strings.length-1;i>=0;i--) {
            res=res+(strings[i]+" ");
        }
        return res;
    }
}
