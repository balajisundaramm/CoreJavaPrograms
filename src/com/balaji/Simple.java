package com.balaji;

public class Simple{
	public static void main(String[] args) {
		//printOddNotDivisibleByThree(5);
		isPowerOfThree(6);
		isPowerOfThree(9);
		isPowerOfThree(12);
		isPowerOfThree(15);
		isPowerOfThree(27);
		isPowerOfThree(33);
		isPowerOfThree(54);
		isPowerOfThree(18);
		isPowerOfThree(81);
		/*addNumberAndItsReverse(1233);
		addNumberAndItsReverse(-1>>>1);
		System.out.println(isIncreasing(123)?"Yes":"No");*/
/*
		double x=121;
		double res=Math.sqrt(x);
		System.out.println(x);*/

	}
	public static void printOddNotDivisibleByThree(int a) {
		if ((a%2)!=0) {
			if (a%3!=0) {
				System.out.println("Yes the number "+a+" is odd and not divisible 3");
			}
			else
				System.out.println("No the number "+a+" is odd but divisible 3");
		}
	}
	public static void isPowerOfThree(int a) {
		/*if (a==1 || a==3) {
			System.out.println("The number "+a+" is power of 3");
		}*/
		if (a==0) {
			System.out.println("The number "+a+" is not power of 3");
		}
		int quo=a/3;
		double result=1;
		if(a%3!=0)
			System.out.println("The number "+a+" is not power of 3");
		else{
		while(quo>=3){
			result=quo%3;
			quo=quo/3;
			if (result!=0) 
				break;
		}				
			if(result==0 && quo==1)
					System.out.println("The number "+a+" is power of 3");
			else
					System.out.println("The number "+a+" is not power of 3");
		}
		
	}

	public static long convertReverse(int num) {
		int a=0;
		long rev=0;
		while (num>0) {
			a=num%10;
			num=num/10;
			rev=(rev*10)+a;
		}
		return rev;
	}
	public static void addNumberAndItsReverse(int num) {
		long rev=convertReverse(num);
		long result=(long)num+rev;
		System.out.println("Sum of the number "+num+" and its reverse "+rev+" is "+result);
	}
	public static boolean isIncreasing(int num) {
		int a=0, b=0;
		while (num>0) {
			a=num%10;
			b=a;
			num=num/10;
			if(b>a)
				return true;
		}
		return false;
	}
}