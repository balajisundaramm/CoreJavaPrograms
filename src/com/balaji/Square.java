package com.balaji;//4) WAP to test whether an int is a perfect square


public class Square{
	public static void main(String[] args) {
		int num=250;
		System.out.println("The number, "+num+" is " +(isSquare(num)?"a perfect square":"not a perect square"));
		num=0;
		System.out.println("The number, "+num+" is " +(isSquare(num)?"a perfect square":"not a perect square"));
		num=36;
		System.out.println("The number, "+num+" is " +(isSquare(num)?"a perfect square":"not a perect square"));
		num=-250;
		System.out.println("The number, "+num+" is " +(validateSquare(num)?"valid":"invalid"));




	}
	public static boolean isSquare(int num) {
		if (!validateSquare(num)) {
			return false;
		}
		int result=0;
		for (int i=0;i<=(num/2);i++) {
			result=i*i;
			if (result==num) {
				return true;
			}
		}
		return false;
	}

	public static boolean validateSquare(int num) {
		return num>=0;
	}
}