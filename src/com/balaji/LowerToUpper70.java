package com.balaji;

/**
 * Created by gokul on 5/10/17.
 */
public class LowerToUpper70 {
    public static void main(String[] args) {
        String s="Apple123";
        System.out.println(convertCase(s));

    }
    public static String convertCase(String s){
        // First Method
        /*String result="";
        for (int i = 0; i <s.length(); i++) {
            result=result+((Character.isUpperCase(s.charAt(i)))?Character.toLowerCase(s.charAt(i)):((Character.isLowerCase(s.charAt(i)))?Character.toUpperCase(s.charAt(i)):s.charAt(i)));
        }
        return result;*/

        //Second Method Explanation of First

        String result="";
        for (int i = 0; i <s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i)))
                result=result+Character.toLowerCase(s.charAt(i));
            else {
                if (Character.isLowerCase(s.charAt(i)))
                    result = result + Character.toUpperCase(s.charAt(i));
                else
                    result = result + s.charAt(i);
            }
        }
        return result;
    }
}
