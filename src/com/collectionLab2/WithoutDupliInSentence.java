package com.collectionLab2;

import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Created by Balaji on 6/11/17.
 */
public class WithoutDupliInSentence {
    public static void main(String[] args) {
        String s="This is mine and mine is my character";
        String[] strings=s.split(" ");
        TreeSet set=new TreeSet();
        LinkedHashSet set1=new LinkedHashSet();
        for (String s1:strings) {
            set.add(s1);
            set1.add(s1);
        }
        System.out.println(set);
        System.out.println("Insertion order"+set1);
    }
}
