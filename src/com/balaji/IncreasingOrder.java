package com.balaji;/*19. WAP to return true if an int input contains all the digits in increasing order (ex: 123 ->
true, 12342->false)*/

public class IncreasingOrder{
	public static void main(String[] args) {
		/*int num=12356798;
		boolean result=checkIncrementOrder(num);
		System.out.println("Is the number, "+num+" in increasing order ");
		System.out.println(result);*/

		//swap(5,12);
		/*int num=250;
		System.out.println("The number, "+num+" is " +(isSquare(num)?"a perfect square":"not a perect square"));
		*/
		//System.out.println(checkIncrementOrder(12323)?"The number is in increment order":"The number is not in increment order");
		
		printIncreasingNumbers(10000);
	}
	public static boolean checkIncrementOrder(int num) {
		/*int b=10,a;
		while (num>0) {
			a=num%10;
			num=num/10;
			if (a>=b)
				return false;
			b=a;
		}
		return true;*/
		int [] numDigits=ArithmeticOperations.separateDigits(num);
		for (int i=0;i<numDigits.length-1;i++) {
			if (numDigits[i]>numDigits[i+1]) {
				return false;
			}
		}
		return true;
	}

	public static void swap(int num1, int num2) {
		System.out.println("Before swaping "+num1+", "+num2);
		num1=num1^num2;
		num2=num1^num2;
		num1=num1^num2;
		System.out.println("Ater swaping "+num1+", "+num2);
	}

	public static boolean isSquare(int num) {
		int result=0;
		for (int i=0;i<=(num/2);i++) {
			result=i*i;
			if (result==num) {
				return true;
			}
		}
		return false;
	}

		public static void printIncreasingNumbers(int limit) {
				int count=0;
				for (int i=0;i<limit;i++) {
					if (checkIncrementOrder(i)) {
						System.out.println(i);
						count++;
					}
				}
				System.out.println("Total numbers are "+count);
		}
}