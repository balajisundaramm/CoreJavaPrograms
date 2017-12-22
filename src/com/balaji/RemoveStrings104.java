package com.balaji;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Balaji on 31/10/17.
 */
public class RemoveStrings104 {
    public static void main(String[] args) {
        String a="1";
        Scanner scanner=new Scanner(System.in);
        while (a!="0") {
            System.out.println("Enter the size of the array");
            String[] str=new String[scanner.nextInt()];
            for (int i = 0; i <str.length ; i++) {
                System.out.println("Enter the elements of string array");
                scanner=new Scanner(System.in);
                str[i] = scanner.nextLine();
            }
            System.out.println("Enter the size of the string to be removed");
            int size=scanner.nextInt();

            System.out.println("Result array is..");
            for (String s:removeItems(str,size)) {
                System.out.println(s);
            }
            System.out.println("Enter 1 to continue 0 to exit");
            scanner=new Scanner(System.in);
            a=scanner.nextLine();
        }
    }

    public static String[] removeItems(String[] str,int size){
        List<String> list=new ArrayList<String>();
        for (String s:str) {
            if (s.length()<size)
                list.add(s);
        }
        String[] result=new String[list.size()];
        int count=0;
        for (Object o:list) {
            result[count++]=(String)o;
        }
        return result;
    }

}
