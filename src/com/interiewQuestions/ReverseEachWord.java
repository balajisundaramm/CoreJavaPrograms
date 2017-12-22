package com.interiewQuestions;

/**
 * Created by Balaji on 5/11/17.
 */
public class ReverseEachWord {
    public static void main(String[] args) {
        String str="I love India";
        System.out.println(reverseEach(str));
        String s="madam";
        System.out.println(isPalindrome(s));
    }

    public static String reverseEach(String str) {
        String[] words=str.split(" ");
        String res="";
        for (String s:words) {
            res=res+reverse(s)+" ";
        }
        return res;
    }

    public static String reverse(String s) {
        char[] c=s.toCharArray();
        String rev="";
        for (int i = 0; i <c.length/2 ; i++) {
            c[i]=(char)(c[i]^c[c.length-1-i]);
            c[c.length-1-i]=(char)(c[i]^c[c.length-1-i]);
            c[i]=(char)(c[i]^c[c.length-1-i]);
        }
        for (char c1:c) {
            rev=rev+c1;
        }
        return rev;

    }

    public static boolean isPalindrome(String s) {
        return (s.equals(reverse(s)))?true:false;
    }
}
