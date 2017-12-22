package com.balaji;

import java.util.Scanner;

/**
 * Created by Balaji on 28/10/17.
 */
public class ShareDigit126 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 1st String");
        String s1=scanner.nextLine();
        System.out.println("enter 2nd String");
        String s2=scanner.nextLine();
        StringBuffer sb1=new StringBuffer(s2);
        System.out.println(s1.equals(sb1.reverse().toString()));
        //return;
        /*int x=1;
        while (x!=0) {
            System.out.println("Enter the value of a");
            Scanner scanner = new Scanner(System.in);
            int a= scanner.nextInt();
            System.out.println("Enter the value of b");
            int b= scanner.nextInt();
            System.out.println(shareDigit(a, b));

            System.out.println("Enter 1 to continue or 0 to exit");
            scanner = new Scanner(System.in);
            x = scanner.nextInt();
        }
*/
    }
    public static boolean shareDigit(int a, int b){
        for (int x:seperateDigits(a)) {
            for (int y:seperateDigits(b)) {
                if (x==y)
                    return true;
            }
        }
        return false;
    }
    public static int[] seperateDigits(int a){
        int [] digits=new int[countDigits(a)];

        int i = digits.length;
        while (a>0){
            if (1>=0)
                digits[--i]=a%10;
            a=a/10;
        }
        return digits;
    }

    public static int countDigits(int a){
        int count=0;
        while (a>0){
            a=a/10;
            count++;
        }
        return count;
    }
}
