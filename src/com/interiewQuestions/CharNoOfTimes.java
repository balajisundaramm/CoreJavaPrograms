package com.interiewQuestions;

/**
 * Created by Balaji on 4/11/17.
 */
/*Eg 1: Input: a1b10
       Output: abbbbbbbbbb
The number varies from 1 to 99.*/


public class CharNoOfTimes {
    public static void main(String[] args){
        try {
            String s = "bb";
            System.out.println(findDigitAndChar(s));
        }
        catch (Throwable t){
            t.printStackTrace();
            t.getMessage();
        }
    }
    public static String findDigitAndChar(String s) throws IllegalArgumentException{
        char[] chars=s.toCharArray();
        String res="";
        String temp="";
        int num=0;
        for (int i =chars.length-1; i >=1;) {
            num = 0;
            char c='!';
            if (Character.isDigit(chars[i-1])) {
                if (!Character.isDigit(chars[i-2])) {
                    num = Integer.parseInt("" + chars[i - 1] + chars[i]);
                    c = chars[i - 2];
                    temp = printChar(num, c);
                    i = i - 3;
                }
                else{
                    throw new IllegalArgumentException("give proper input");
                }
            }
            else{
                if (!Character.isDigit(chars[i-1])) {
                    num = Integer.parseInt("" + chars[i]);
                    c = chars[i - 1];
                    temp = printChar(num, c);
                    i = i - 2;
                }
                else{
                    throw new IllegalArgumentException("give proper input");
                }
            }
            res=temp+res;
        }
        return res;
    }
    // this method is used only for printing the char repeatedly upto the num..
    public static String printChar(int num,char c){
        int loop=0;
        String temp="";
        while (loop<num) {
            temp = temp + c;
            loop++;
        }
        return temp;
    }

}
