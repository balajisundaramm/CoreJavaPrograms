package com.balaji;

import java.util.*;

/**
 * Created by Balaji on 4/11/17.
 */
public class UniqueStringInCollec139 {
    public static void main(String[] args) {
        String[] str={"Book","pen","Pen","Pencil","Paper","Bottle","Mouse","book"};
        for (String s:removeDuplicates(str)) {
            System.out.println(s);
        }
    }
    public static String[] removeDuplicates(String [] str){
        LinkedHashSet<String> list=new LinkedHashSet<String>();
       /* list.add(str[0]);
        for (int i = 0; i <str.length ; i++) {
            String temp="";
            for (int j = 0; j <=i-1; j++) {
                if (!(str[i].equals(str[j])))
                    temp=str[i];
                break;
            }
            list.add(temp);

        }*/
       list.add(str[0]);
        for (int i=1;i<str.length;i++) {
            for (int j = 0; j <i ; j++) {
                if (!str[i].equalsIgnoreCase(str[j])) ;
                list.add(str[i]);
            }
        }

        String[] res=new String[list.size()];
        int count=0;
        for (Object o:list) {
            res[count++]=(String)o;
        }
        return res;
    }
}
