package com.balaji;

public class Sub1
{
	public static void main(String[] args) 
	{
		int a = 15;
		int b = 10;
		int c = Subtraction(a,b);

		System.out.println("Subtraction is "+c);
		}
			public static int Subtraction(int a, int b)
			 {
				int c=0;
				c= a-b;
				return c;
			}
	
}