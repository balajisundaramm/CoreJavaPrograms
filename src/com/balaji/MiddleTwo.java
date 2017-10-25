package com.balaji;

import java.util.Scanner;

/**
 * Created by gokul on 26/9/17.
 */
public class MiddleTwo {
    public static void main(String[] args){
        System.out.println("Enter the value");
        Scanner scanner = new Scanner(System.in);
        System.out.println(middleTwo(scanner.next()));
    }
    public static String middleTwo(String str) {
        int pos1=((str.length()/2)-1);
        int pos2=((str.length()/2)+1);

       return str.substring(pos1,pos2);

    }

}
