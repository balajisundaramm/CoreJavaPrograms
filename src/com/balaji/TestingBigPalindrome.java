package com.balaji;

/**
 * Created by Balaji on 10/10/17.
 */
public class TestingBigPalindrome {
    public static void main(String[] args) {
        String str="lcmadamxhgfdMADAMdfgkjhgfdsab";
        System.out.println("Big palindrome is "+bigPalindrome(str));;


    }

    public static String bigPalindrome(String str) {
        String firstSet="";
        String max="";
        for (int i = 0; i <str.length()-1 ; i++) {
            for (int j = str.length(); (j-i)>1 ; j--) {
                firstSet=str.substring(i,j);
                boolean b=isPalindrome(firstSet);
                if (b){
                    if (max.length()<firstSet.length())
                        max=firstSet;
                }

            }
        }

        return max;
    }

    // Checking palindrome
    public static boolean isPalindrome(String str) {
        char[] temp=str.toCharArray();
        for (int i = 0; i <(str.length()/2) ; i++) {
            temp[i]=(char)(temp[i]^temp[(temp.length-1-i)]);
            temp[temp.length-1-i]=(char)(temp[i]^temp[(temp.length-1-i)]);
            temp[i]=(char)(temp[i]^temp[(temp.length-1-i)]);
        }
        String reverse=new String(temp);
        //System.out.println(reverse);
        return (str.equals(reverse));
    }
}

