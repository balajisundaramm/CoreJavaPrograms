package com.balaji;

/**
 * Created by gokul on 6/10/17.
 */
public class SortingStrings {
    public static void main(String[] args) {
        String str="bcda";
        System.out.println(sortString(str));
    }
    public static String sortString(String str){
        char[] temp=str.toCharArray();
        int z=0;
        while (z<temp.length){
            for (int i = 1; i <temp.length ; i++) {
                char first=temp[i-1];
                if (first>temp[i]){
                    first=(char)(first^temp[i]);
                    temp[i]=(char)(first^temp[i]);
                    first=(char)(first^temp[i]);
                    temp[i-1]=first;
                }
            }
            z++;
        }
        String result="";
        for (char x:temp) {
            result=result+x;
        }
        return result;
    }
}
