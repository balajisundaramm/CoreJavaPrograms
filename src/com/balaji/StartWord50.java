package com.balaji;

/**
 * Created by gokul on 2/10/17.
 */
public class StartWord50 {
    public static void main(String [] args){
        String str="hippo";
        String word="i";
        System.out.println(startWord(str, word));
    }
    public static String startWord(String str, String word) {
        /*if ((word.length()==1) && (str.contains(word)))
            return str.substring(0,1);
        if ((word.length()!=1) && (str.charAt(1) == word.charAt(1)))
            return str.substring(0,(word.length()));
        return str;*/

        if(str.indexOf(word.substring(1),1)==1)
            return str.substring(0,word.length());
        else return str;
    }
}
