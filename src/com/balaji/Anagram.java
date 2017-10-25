package com.balaji;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Balaji on 12/10/17.
 */
public class Anagram {
    public static void main(String[] args) {

        char [] c={'c','b','a'};
        System.out.println(swap(c));

        /*Scanner sc1=new Scanner(System.in);
        int a=1;
        while(a!=0) {
            System.out.println("Enter 1st String");
            String str1 = sc1.nextLine();
            System.out.println("Enter 2nd String");
            String str2 = sc1.nextLine();
           System.out.println(str1 + " , " + str2 + " is ---> " + isAnagram(str1, str2));
           System.out.println("Enter zero to Exit or 1 to continue");
           a = sc1.nextInt();
*/

       // }
    }

    public static String isAnagram(String str1, String str2) {
        // method 1

        /*char[] chars1=str1.toCharArray();
        chars1=bubbleSortAssending(chars1);
        Object[] objects1={chars1};
        char[] chars2=str2.toCharArray();
        chars2=bubbleSortAssending(chars2);
        Object[] objects2={chars2};
        return (Arrays.deepEquals(objects1,objects2))?"Anagram":"No anagram";
*/

        // method 2


       // str1=str1.trim().toLowerCase();
       // str2=str1.trim().toLowerCase();
        char[] c1=str1.trim().toLowerCase().toCharArray();
        char[] c2=str2.trim().toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (char x:c1) {
            str1=""+x;
        }
        for (char x:c2) {
            str2=""+x;
        }
        return (str1.equals(str2))?"Anagram":"Not anagram";


    }

    public static char[] bubbleSortAssending(char[] chars) {
        int z=0;
        while (z<chars.length){
            for (int i=1; i<chars.length;i++){
                char min=chars[i-1];
                if(min>chars[i]) {
                    min = (char) (min ^ chars[i]);
                    chars[i] = (char) (min ^ chars[i]);
                    min = (char) (min ^ chars[i]);
                    chars[i - 1] = min;
                }
            }
            z++;
        }
        return chars;
    }

    public static char[] swap(char[] chars) {
        char min=chars[0];
        for (int i=0;i<chars.length-1;i++) {
            if (min > chars[i + 1]) {
                min = chars[i + 1];
                min = (char) (min + chars[i + 1]);
                chars[i + 1] = (char) (min - chars[i + 1]);
                min = (char) (min - chars[i + 1]);
                chars[i + 1] = min;
            }
        }
        for (char c:chars) {
            System.out.println(c);
        }
        return chars;


    }
}
