package com.balaji;


/*Created by Balaji on 5/10/17.*/


import java.util.Scanner;

public class BigPalindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=s.nextLine();
        System.out.println("Big palindrome is "+bigPalindrome(str));;


    }

   public static String bigPalindrome(String str) {
        String firstSet="";
      // String[] strings=new String[55];
       //String[] result=new String[2];
       //int a=0,temp=0;
       // Finding the sets of possible strings and checking they are Palindromes
        /*for (int i = 0; i <str.length()-1 ; i++) {
            for (int j = str.length(); (j-i)>1 ; j--) {
                firstSet=str.substring(i,j);
                strings[temp++]=firstSet;
                boolean b=isPalindrome(firstSet);
                if (b)
                    result[a++]=firstSet;
            }
        }
       System.out.println("th:src="@{ types of strings");
       int m=1;
       for (String x:strings) {
           System.out.println(m+x);
           m++;
       }
       for (String x:result) {
           System.out.println("Palindromes are "+x);
       }
       String max=result[0];
       for (int i = 1; i <result.length; i++) {
           if (max.length()<result[i].length())
               max=result[i];
       }
       return max;*/

        // Method 2 solving this:
        String max="";
       boolean b=true;
       for (int i = 0; i <=str.length()-1 ; i++) {
           for (int j = str.length(); (j-i)>0 ; j--) {
               firstSet=str.substring(i,j);
               if (firstSet.length()>1) {
                   b = isPalindrome(firstSet);
               }
               if (b){
                   if (max.length()<firstSet.length())
                       max=firstSet;
               }
               b=true;

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
