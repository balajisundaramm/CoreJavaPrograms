package com.balaji;

/**
 * Created by Balaji on 5/11/17.
 */
public class StringX151 {
    public static void main(String[] args) {
        //String str="XhxxxxxxxxiX";
        //System.out.println(stringX(str));

        int a=19;
    }

    public static String stringX(String str) {
        String res = "" + str.charAt(0);
        String temp = str.substring(1, str.length() - 1);
        String[] strings = temp.split("x");
        for (String s : strings) {
            res = res + s;
        }
        return res + str.charAt(str.length() - 1);
    }

    public static boolean loneTeen(int a, int b) {

        return (teen(a) && !teen(b))?true:(!teen(a) && teen(b))?true:false;

    }
    public static boolean teen(int a){
        return (a>12 && a<20);
    }
}
