package com.balaji;
import java.util.*;
/**
 * Created by Balaji on 5/11/17.
 */
public class RemoveDublicates148 {
    public static void main(String[] args) {
        String[] s={"Apple","Orange","Apple","Mango"};
        ArrayList<String> al=new ArrayList<String>();
        for (String s1:s) {
            al.add(s1);
        }
        System.out.println(removeRecurringStrings(al));

    }

    public static ArrayList<String> removeRecurringStrings(ArrayList<String> al) {
        LinkedHashSet<String> set=new LinkedHashSet<>(al);
        ArrayList<String> result=new ArrayList<>(set);
        return result;
    }
}
