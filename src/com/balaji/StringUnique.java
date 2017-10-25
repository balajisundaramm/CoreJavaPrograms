package com.balaji;

import java.util.Scanner;

/**
 * Created by gokul on 29/9/17.
 */
public class StringUnique {
    public static void main(String[] args){
        /*System.out.println("Enter the string");
        Scanner scanner=new Scanner(System.in);
        isStringUnique(scanner.hasNext());*/
        String s="abcdeff";
        System.out.println(isStringUnique(s));

    }
    public static boolean isStringUnique(String s){
        for(int i=0;i<s.length();i++){
            for (int j = 0; j < s.length(); j++) {
                if(i!=j) {
                    if (s.charAt(i) == s.charAt(j))
                        return false;
                }
            }
        }
        return true;
    }
}
