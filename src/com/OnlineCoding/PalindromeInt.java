package com.OnlineCoding;

import java.util.Scanner;

/**
 * Created by Balaji on 26/10/17.
 */
public class PalindromeInt {
    public static void main(String[] args) {
        int a=1;
        while (a==1){
            System.out.println("Enter an int number");
            Scanner scanner=new Scanner(System.in);
            int n=scanner.nextInt();
            //System.out.println(isPalindrome(n));
            System.out.println(checkPalindrome(n));
            if (a==1) {
                System.out.println("Enter 1 to retest");
                System.out.println("Enter 0 to exit");
                scanner = new Scanner(System.in);
                a = scanner.nextInt();
            }
            else {
                scanner = new Scanner(System.in);
                a = scanner.nextInt();
            }
        }
    }
    public static boolean isPalindrome(int x){
        int num1=x;
        long l=0;
        int num=(x<0)?x*(-1):x;
        while (num>0){
            int temp=num%10;
            num=num/10;
            l=(l*10)+temp;
        }
        int result=(int)l;
        //result=(l>(-1>>>1))?0:(x<0)?result*(-1):result;
        return (num1==result);
    }

    // Method 2

    public static boolean checkPalindrome(int x){
        // Special cases:
        // As discussed above, when x < 0, x is not a palindrome.
        // Also if the last digit of the number is 0, in order to be a palindrome,
        // the first digit of the number also needs to be 0.
        // Only 0 satisfy this property.
        if(x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while(x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // When the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        // For example when the input is 12321, at the end of the while loop we get x = 12, revertedNumber = 123,
        // since the middle digit doesn't matter in palidrome(it will always equal to itself), we can simply get rid of it.
        return x == revertedNumber || x == revertedNumber/10;
    }

}
