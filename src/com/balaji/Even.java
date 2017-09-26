package com.balaji;//2) 	WAP to test whether an int number is even

public class Even{
	public static void main(String[] args) {
		System.out.println("Invoking isEven method");
		System.out.println("The number, 7 is : " + (isEven(7)?"Even":"not Even"));
		System.out.println("The number, 4 is : " + (isEven(4)?"Even":"not Even"));
		System.out.println("The number, 0 is : " + (isEven(0)?"Even":"not Even"));
		System.out.println("The number, -1>>>1 is : " + (isEven(-1>>>1)?"Even":"not Even"));
		System.out.println("The number, -4 is : " + (isEven(-4)?"Even":"not Even"));
		System.out.println("The number, -2147483648 is : " + (isEven(-2147483648)?"Even":"not Even"));
	}
	

	public static boolean isEven(int num) {
		return (num&1)==0;
	}
}