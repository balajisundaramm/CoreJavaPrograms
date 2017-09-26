package com.balaji;//11) WAP to identify if an int number is a palindrome!

public class Palindrome{
	public static void main(String[] args) {
		int num=121;
		System.out.println("The number, "+num+" is : "+ (checkPalindrome(num)?"Palindrome":"not Palindrome"));
		num=1213;
		System.out.println("The number, "+num+" is : "+ (checkPalindrome(num)?"Palindrome":"not Palindrome"));
		num=12121;
		System.out.println("The number, "+num+" is : "+ (checkPalindrome(num)?"Palindrome":"not Palindrome"));
		num=543735;
		System.out.println("The number, "+num+" is : "+ (checkPalindrome(num)?"Palindrome":"not Palindrome"));

	}
	public static boolean checkPalindrome(int num) {
			int a=num;
			int result=0;
		while(num>0){
			
			int b=num%10;
			num=num/10;
			result=(result*10)+b;
			
		}
		 if(result==a)
		 	return true;
		 else
		 	return false;
		
	}
}


