package com.balaji;//12)WAP to sum the digits in an int input.

public class AdditionOfDigits{
	public static void main(String[] args) {
		sumDigits(1);
		sumDigits(10);
		sumDigits(123456);
		sumDigits(987654);
		sumDigits(-1>>>1);

	}
	public static void sumDigits(int num) {
		int sum=0;
		int a=num;
		while(num>0){
			int b=num%10;
			num=num/10;
			sum=sum+b;
		}
		System.out.println("Sum of the digits in the number "+a+" is "+sum);
	}
}


