package com.balaji;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner=new Scanner(System.in);
        printFibonacci(scanner.nextInt());
        printFibonacci(69);
        printFibonacci(8);
        printFibonacci(81);

    }

    public static void printFibonacci(int limit) {
        int a = 1, b = 1, c = 0;
        System.out.println(a);
        System.out.println(b);
        while (limit >= (c = a + b)) {
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}