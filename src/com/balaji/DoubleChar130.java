package com.balaji;

/**
 * Created by Balaji on 31/10/17.
 */
public class DoubleChar130 {
    public static void main(String[] args) {
        String str="abc";
        System.out.println(doubleChar(str));
    }
    // use charAt
    // convert into chararray print one char twice concate

    public static String doubleChar(String str) {
        String result="";
        for (int i = 0; i <str.length() ; i++) {
            String temp1=str.substring(i,(i+1));
            result=result+temp1+temp1;
        }
        return result;
    }
}
