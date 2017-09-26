package com.balaji;

public class Fibonacci{
	public static void main(String[] args) {
		/*int limit;
		limit = 23;
		while(limit<=23){
		int a=1;
		if(a==1)
			System.out.println(a);
		int b=1;
		if(b==1)
			System.out.println(b);
		int c=a+b;
		if(c==2)
			System.out.println(c);
		int d;
		int e;
		d=b+c;
		System.out.println(d);
		e=c+d;
		System.out.println(e);
		limit=e;
		c=d;
		d=e;
	}*/
	printFibonacci(6);
	printFibonacci(69);
	printFibonacci(8);
	printFibonacci(81);

	}
	public static void printFibonacci(int limit) {
		int a = 1, b=1, c=0;
		System.out.println(a);
		System.out.println(b);
		while(limit>=(c=a+b)) {
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}