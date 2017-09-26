package com.balaji;

public class Assignment{
	public static void main(String[] args) {
		System.out.println("*************************");
	/*	
	// Invoking findPowersof2 method 
		int num;
		String result;
		num=-5;
		result= findPowersOfTwo(num);
		System.out.println(num +" is "+result);

		num=1;
		result= findPowersOfTwo(num);
		System.out.println(num +" is "+result);

		num=5;
		result= findPowersOfTwo(num);
		System.out.println(num +" is "+result);

		num=60;
		result= findPowersOfTwo(num);
		System.out.println(num +" is "+result);

		num=64;
		result= findPowersOfTwo(num);
		System.out.println(num +" is "+result);

		num=-1>>>1;
		result= findPowersOfTwo(num);
		System.out.println(num +" is "+result);
	*/	
	
	

	/*
	// Invoking Print fibo

		System.out.println("Invoking printFibonacci method");
		System.out.println("Printing fibonacci for -4 : ");
		creatN_NumberOfFibonacci(-4);
		System.out.println("Printing fibonacci upto 1 : ");
		creatN_NumberOfFibonacci(1);
		System.out.println("Printing fibonacci upto 2 : ");
		creatN_NumberOfFibonacci(2);
		System.out.println("Printing fibonacci upto 4: ");
		creatN_NumberOfFibonacci(4);
		System.out.println("Printing fibonacci upto 10: ");
		creatN_NumberOfFibonacci(10);
		System.out.println("Printing fibonacci upto 80: ");
		creatN_NumberOfFibonacci(80);
	*/

	/*int s=Integer.parseInt(args[0]);
	int s1=Integer.parseInt(args[1]);*/
	/*int result= findGCD(1,0);
		System.out.println(" the GCD of the given 2 numbers is "+result);
	result= findGCD(13,34);
		System.out.println(" the GCD of the given 2 numbers is "+result);
	result= findGCD(5,5);
		System.out.println(" the GCD of the given 2 numbers is "+result);
	result= findGCD(30,15);
		System.out.println(" the GCD of the given 2 numbers is "+result);
	*/
		//System.out.println("The number, 121 is : " + (checkPalindrome(121)?"Palindrome":"not Palindrome"));
	
		/*int result=findLCM(25,10);
		System.out.println(" the LCM of the given 2 numbers is "+result);*/

		//sumDigits(1);

		//convertBinary(10);


		//System.out.println("The number, 371 is : " + (checkArmstrong(371)?"Armstrong":"not Armstrong"));

		checkArmstrong();
	}
	

	// 5.WAP to test whether an int is a power of 2

	public static String findPowersOfTwo(int num) 
	{

		if(num<0)
			return "Invalid";
		if(num==1 || num==2 || num==4 || num==8)
			return "Yes, The given number is powers of 2";
		if(num==0 || num==3 || num==5 || num==6)
			return "No, The given number is not powers of 2";

		if(num%2==0)
		{
			for(int a=4; a<num; a*=2)
			{
				if(num%a!=0)
					return "No, The given number is not powers of 2";
			}
					return "Yes, The given number is powers of 2";
		}
		else
			
			return "No, The given number is not powers of 2";		
	}
	

	// 8.WAP to generate n number of fibonacci sequence, given n

	public static void creatN_NumberOfFibonacci(int num) {
		if (num>0) {
			int i=3;
			long a=1, b=1, c=0;
			if(num==1)
				System.out.println(a+" ");
			if(num==2){
				System.out.print(a+" ");
				System.out.println(b+" ");
			}
			if(num>=3){
				System.out.print(a+" ");
				System.out.print(b+" ");
			}
			for(i=3; i<=num; i++){
				c=a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
			}
			System.out.println("");
		}
		else 
			System.out.println("Invalid input");
	} 

	// 9. WAP to identity the GCD of 2 int numbers
	
	public static int findGCD(int num1, int num2) {
		//if(num1==0 || num2==0)
			//return "Invalid";
		int gcd=1;
		if(num1==num2)
			return num1;
		else {
			int low=num1>num2?num2:num1;
			for(int i=2; i<=low; i++){
				if(((num1%i)==0) && ((num2%i)==0)){
					gcd=i;
				
				}

			}
			return gcd;
		}
		
	}

	// 11.WAP to identify if an int number is a palindrome

	public static boolean checkPalindrome(int num) {
			int a=num;
			int result=0;
		while(num>0){
			
			int b=num%10;
			num=num/10;
			result=(result*10)+b;
			
		}
		System.out.println(result);
		 if(result==a)
		 	return true;
		 else
		 	return false;
		
	}

	// 10. WAP to identity the LCM of 2 int numbers

	public static int findLCM(int num1, int num2) {
		int lcm=1;
		int gcd=findGCD(num1,num2);
		lcm=((num1*num2)/gcd);
		return lcm;
	}

	// 12. WAP to sum the digits in an int input and return it!

	public static void sumDigits(int num) {
		int sum=0;
		while(num>0){
			int b=num%10;
			num=num/10;
			sum=sum+b;
		}
		System.out.println(sum);
	}

// 13) a) WAP to generate the binary number representation for an int number!

	/*public static void convertBinary(int num) {
		while(num>0){
		int a=num%2;
		int b=~a;
		num=num/2;
		System.out.print(b+" ");
	}

		
	}*/

// 16. Check the given number is armstrong or not

	public static void checkArmstrong() {
		System.out.println("inside armstrong");
		int i,n,r,t;
		for(i=0;i<1000;i++){
			t=i;
			n=0;
			while(t>0){
				r=t%10;
				n=n+r*r*r;
				t=t/10;
			}
			
			if(i==n){
				System.out.println("Armstrong numbers are");
				System.out.print(i+" ");
			}
		}

		}

		
	
}
		



	

