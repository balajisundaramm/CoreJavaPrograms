package com.balaji;

/**
 * Created by Balaji on 2/11/17.
 */
public class OZ138 {
    public static void main(String[] args) {
        String str="ghzhgf";
        System.out.println(startOz(str));
    }
    public static String startOz(String str) {
        if (str.startsWith("o"))
            if (str.charAt(1)=='z')
                return "oz";
            else
                return "o";
        else if (str.charAt(1)=='z')
            return "z";
        else return str;

    }
}
