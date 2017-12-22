package com.balaji;//7) WAP to generate fibonacci till a number given!

public class FibonacciUptoNumbers{
	public static void main(String[] args) {
		System.out.println("Invoking printFibonacci method");
		System.out.println("Printing fibonacci for -4 : ");
		printFibonacci(-4);
		System.out.println("Printing fibonacci upto 6 : ");
		printFibonacci(1);
		System.out.println("Printing fibonacci upto 89 : ");
		printFibonacci(89);
		System.out.println("Printing fibonacci upto 152: ");
		printFibonacci(152);
		System.out.println("Printing fibonacci upto 2147483647 : ");
		printFibonacci(2147483647);		
	}

	public static void printFibonacci(int limit) {
		if (limit>0) {
			long a = 1, b=1;
			long c=0;
			System.out.print(a+" ");
			System.out.print(b+" ");
			while(limit>=(c=a+b)) {
				System.out.print(c+" ");
				a=b;
				b=c;
			}
			System.out.println("");
		}else {
			System.out.println("Invalid input");
		}
	}		
}