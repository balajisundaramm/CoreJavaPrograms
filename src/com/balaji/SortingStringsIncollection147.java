package com.balaji;
import java.util.*;

/**
 * Created by Balaji on 3/11/17.
 */
public class SortingStringsIncollection147 {
    public static void main(String[] args) {
        String[] s={"Java","cat","Program","doggy","niki"};
        ArrayList<String> arr=new ArrayList<String>();
        for (String s1:s) {
            arr.add(s1);
        }
        System.out.println(sortListAccordingToStringLength(arr));


    }
    public static ArrayList<String> sortListAccordingToStringLength(ArrayList<String> arr){
        ArrayList<String> result=new ArrayList<String>();
        String[] input=new String [arr.size()];
        int x=0;
        for (Object o:arr) {
            input[x++]=(String)o;
        }
        int z=0;
        while (z<input.length){
            for (int i = 0; i < input.length-1 ; i++) {
                String first=input[i];
                String next=input[i+1];
                if (first.length()>next.length()){
                    String temp=first;
                    input[i]=next;
                    input[i+1]=temp;
                    first=input[i+1];
                }
            }
            z++;
        }
        for (String s:input) {
            result.add(s);
        }
        return result;
    }
}
