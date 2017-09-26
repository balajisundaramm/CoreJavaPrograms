package com.balaji;

public class Hello10Times
{
	public static void main(String[] args)
	{

// print Helloworld with no 

	/*	int i=1;
		for(i=1; i<=10; i++)

		System.out.println("Hello World " +i);
	 */

// Print 1 to 100 using for
	/*	int i=1;
		for(i=1; i<=10; i++)

		System.out.println(i);
	*/

// Print 1 to 100 using while
	
	/*	int i=1;
		while(i<=10)
		{
		System.out.println(i);	
		i++;
		}
	*/

// Print 1 to 100 by using do while

	/*	int i=1;
		do
		{
		System.out.println(i);	
		i++;
		}
		while(i<=10);
	*/

// print odd numbers 1 to 100
	/*
		int i=1;
		for(i=1; i<=100; i=i+2)
		{
			//if(c=(i%2)!=0)
			System.out.println(i); 
		}
	*/

// print even
	/*	
		int i=2;
		for(i=2; i<=100; i=i+2)
		{
			//if(c=(i%2)!=0)
			System.out.println(i); 
		}
	*/
//7. non multiples of 3
	/*	
		int i=0;
		while(i<=100)
		{

			if((i%3)!=0)
			System.out.println(i); 
		i++;
		}
	*/
//8. print enen and odd

	/*	
		int i=0;
		while(i<=100)
		{
			if((i%2)!=0)
			System.out.println("ODD " +i);
			else
			System.out.println("EVEN " +i);
			i++;		
		}
	*/

//9. print the divisible of 3 & 5 but not both

	/*	
		int i=1;
		while(i<=100)
		{
		if((i%3)==0 ^ (i%5)==0)
			System.out.println("DIVISIBLE "+i);
			i++;
		}
	*/
//10. left shift and right shift
		//int i=100;
		int i=-1;
		//i= i<<2;
		//i= i>>2;
		i= i>>>2;
		  
		System.out.println(i);





	}
}