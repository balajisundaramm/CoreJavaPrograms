package com.balaji;

import java.util.Scanner;

/**
 * Created by Balaji on 28/10/17.
 */
public class CigerParty125 {
    public static void main(String[] args) {
        int x=1;
        while (x!=0) {
            System.out.println("Enter the value of cigrs");
            Scanner scanner = new Scanner(System.in);
            int cigars = scanner.nextInt();
            System.out.println("Enter true if it is weekend or enter false");
            boolean isWeekend = scanner.nextBoolean();
            System.out.println(cigarParty(cigars, isWeekend));

            System.out.println("Enter 1 to continue or 0 to exit");
            scanner = new Scanner(System.in);
            x = scanner.nextInt();
        }

    }

    public static boolean cigarParty(int cigars, boolean isWeekend) {
        if (!isWeekend && (cigars>39 && cigars<61))
            return true;
        if(isWeekend && (cigars>39))
            return true;
        else
            return false;
    }
}
