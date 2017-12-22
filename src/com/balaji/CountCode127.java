package com.balaji;

/**
 * Created by Balaji on 31/10/17.
 */
public class CountCode127 {
    public static void main(String[] args) {
        String str="codepraceticecopecore";
        System.out.println(countCode(str));
    }
    public static int countCode(String str) {
        int count=0;
        for (int i = 0; i <str.length()-3; i++) {

            if (str.charAt(i)=='c' && str.charAt(i+1)=='o' && str.charAt(i+3)=='e')
                count++;
        }
        return count;
    }
}
