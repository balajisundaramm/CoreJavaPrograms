package com.interiewQuestions;

/**
 * Created by Balaji on 4/11/17.
 */
public class NumberOfVowelsDigitsLetters {
    public static void main(String[] args) {
        String s="hi how are you123456";
        /*System.out.println(countDigits(s));
        System.out.println(countVowels(s));
        System.out.println(countLetters(s));
*/
        String s3 = new String("Test");
        s3 = s3.intern();
        String s4 = "Test";
        System.out.println(s3 == s4);//fasle(i need true)

    }

    public static int countVowels(String s) {
        int vowels=0;
        for (int i = 0; i <s.length() ; i++) {
            s=s.toLowerCase();
            if (isVowel(s.charAt(i)))
                vowels++;
        }
        return vowels;
    }

    public static boolean isVowel(char c) {
        if ((c=='a' || c=='e' || c=='i'
                || c=='o' ||c=='u'))
            return true;
        return false;
    }
    public static int countLetters(String s) {
        int letters=0;
        for (int i = 0; i <s.length() ; i++) {
            s=s.toLowerCase();
            if (Character.isLetter(s.charAt(i)) && !isVowel(s.charAt(i)) )
                letters++;
        }
        return letters;
    }
    public static int countDigits(String s) {
        int digits=0;
        for (int i = 0; i <s.length() ; i++) {
            if (Character.isDigit(s.charAt(i)))
                digits++;
        }
        return digits;
    }

}
