package com.balaji;//15)WAP to swap 2 ints without using a temp variable!

public class SwappingTwoNumbers{
	public static void main(String[] args) {
		System.out.println("The numbers are,");
		swap(5,8);
	}

	public static void swap(int num1, int num2) {
		System.out.println("Before swaping "+num1+", "+num2);
		num1=num1^num2;
		num2=num1^num2;
		num1=num1^num2;
		System.out.println("Ater swaping "+num1+", "+num2);
	}

}