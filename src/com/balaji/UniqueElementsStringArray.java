package com.balaji;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Balaji on 2/11/17.
 */
public class UniqueElementsStringArray {
    public static void main(String[] args) {
        String[] str={"Pen","Pencil","Pen"};
        for (String s:removeDuplicates(str)) {
            System.out.println(s);
        }
    }

    public static String[] removeDuplicates(String[] str) {
        Set<String> set=new HashSet<String>();
        int count=0;
        for (String s:str) {
            set.add(s);
        }
        String[] res= new String[set.size()];
        for (Object o:set) {
            res[count++] = (String) o;
        }
        return res;

    }
}
