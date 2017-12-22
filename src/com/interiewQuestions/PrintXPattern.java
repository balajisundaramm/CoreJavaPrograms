package com.interiewQuestions;

import java.util.Scanner;

/**
 * Created by Balaji on 6/11/17.
 */
public class PrintXPattern {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while (scanner.hasNext()){
            System.out.println("enter string");
            printX(scanner.nextLine());
        }
    }
    public static void printX(String s){
        for(int i=0;i<s.length();i++){
            for(int j=0;j<s.length();j++){
                if(j==i || (s.substring(j).length()==i+1))
                    System.out.print(s.charAt(j)+"");
                else
                    System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}
