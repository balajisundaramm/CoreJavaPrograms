package com.balaji;

/**
 * Created by gokul on 5/10/17.
 */
public class StringRotation66 {
    public static void main(String[] args) {
        String s1="Uttara";
        String s2="taraUt";
        System.out.println(isStringRotated(s1,s2));
    }
    public static boolean isStringRotated(String s1, String s2) {
        // First method

        /*String result="";
        for (int i = 0; i <s1.length() ; i++) {
            result=s1.substring(s1.length()-1-i)+s1.substring(0,s1.length()-1-i);
            if (s2.equals(result))
                return  true;
        }
        return false;*/

        // Second method
        /*
        return ((s2+s2).contains(s1))?true:false;
        */

        //Third method Prithivi
        System.out.println(s2.substring(s2.length()-2));
        System.out.println(s1.indexOf(s2.substring(s2.length()-2)));
        if(s1.indexOf(s2.substring(s2.length()-2))>=0&&s1.length()==s2.length())
            return true;
        else
            return false;
    }
}
