package com.balaji;

import java.util.Scanner;

/**
 * Created by Balaji on 28/10/17.
 */
public class RedLottery123 {
    public static void main(String[] args) {
        int x=1;
        while (x!=0){
            System.out.println("Enter the value of a");
            Scanner scanner=new Scanner(System.in);
            int a=scanner.nextInt();
            System.out.println("Enter the value of b");
            scanner=new Scanner(System.in);
            int b=scanner.nextInt();
            System.out.println("Enter the value of c");
            scanner=new Scanner(System.in);
            int c=scanner.nextInt();
            System.out.println(redTicket(a,b,c));

            System.out.println("Enter 1 to continue or 0 to exit");
            scanner=new Scanner(System.in);
            x=scanner.nextInt();
        }
    }

    public static int redTicket(int a, int b, int c) {
        if (a==2 && b==2 && c==2)
            return 10;
        if (a==b && b==c)
            return 5;
        if (a!=b && a!=c)
            return 1;
        else
            return 0;
    }
}
