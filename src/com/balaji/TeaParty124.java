package com.balaji;

import java.util.Scanner;

/**
 * Created by Balaji on 28/10/17.
 */
public class TeaParty124 {
    public static void main(String[] args) {
        int x=1;
        while (x!=0) {
            System.out.println("Enter the value of tea");
            Scanner scanner = new Scanner(System.in);
            int tea = scanner.nextInt();
            System.out.println("Enter the value of candy");
            scanner = new Scanner(System.in);
            int candy = scanner.nextInt();
            System.out.println(teaParty(tea, candy));

            System.out.println("Enter 1 to continue or 0 to exit");
            scanner = new Scanner(System.in);
            x = scanner.nextInt();
        }
    }

    public static int teaParty(int tea, int candy) {
        if (tea<5 || candy<5)
            return 0;
        return ((tea>5 && candy>5) && ((tea>=(2*candy)) || (candy>=(2*tea))))?2:1;
    }
}
