package com.balaji;//24. method invoking


public class Test
{
	public static void main(String[] args)
	{
	
		int x=10;
		System.out.println(x); //10

		int y= Test.process(x);
		System.out.println(y);	//20
	}
		public static int process(int a)
	{
		System.out.println("In process"+a); //10
		a=20;
		return a;
	
// 25. multiple class


	}
/*	public class B
	{
	
	}

public class c
	{
	
	}
*/

// 27. char value increasing

/*	
	public static void main(String[] args)
	{
		char c='a';
		int x=c;
		System.out.println(x); //97

		for(int i=0; i<=25; i++)
		{
			System.out.println(x++);
		}
	}
*/

// 26. 2 methods cth:src="@{ling
/*

	public static void main(String[] args)
	{
		int x=10;
		System.out.println(x); // 10

		int y= Test.process(x);
		System.out.println(y);	// 20
	}
		public static int process(int x)
	{
		System.out.println("In process"+x); // 10
		int z= Test.flow(x);
		System.out.println(z); // 50
		x=20;
		return x;
	}

		public static int flow(int a)
		{
			System.out.println("In flow" + a); // 10
			a=50;
			return a;
		}	
*/
}



