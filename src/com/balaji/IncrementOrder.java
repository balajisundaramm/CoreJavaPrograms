package com.balaji;/*19)WAP to return true if an int input contains all the digits in increasing order (ex: 123 ->
true, 12342->false)!
20)A number is said to be made up of non-decreasing digits if all the digits to the left of
any digit is less than or equal to that digit. For example, the four-digit number 1234 is
composed of digits that are non-decreasing. Some other four-digit numbers that are
composed of non-decreasing digits are 0011, 1111, 1112, 1122, 2223. As it turns out,
there are exactly 715 four-digit numbers composed of non-decreasing digits. Notice
that leading zeroes are required: 0000, 0001, 0002 are all valid four-digit numbers with
nondecreasing digits.Find all the 715 such 4 digit numbers.*/


public class IncrementOrder{
	public static void main(String[] args) {

		System.out.println("Invoking checkIncrementOrder method");
		int num=1235679;
		boolean result=checkIncrementOrder(num);
		System.out.println("Is the number, "+num+" in increasing order ");
		System.out.println(result);
		num=12388;
		result=checkIncrementOrder(num);
		System.out.println("Is the number, "+num+" in increasing order ");
		System.out.println(result);



		System.out.println("Invoking printIncreasingNumbers method");
		System.out.println("The numbers in incresing order from 0000 to 9999");
		printIncreasingNumbers(10000);

	}


		public static boolean checkIncrementOrder(int num) {
		int [] numDigits=separateDigits(num);
		for (int i=0;i<numDigits.length-1;i++) {
			if (numDigits[i]>=numDigits[i+1]) {
				return false;
			}
		}
		return true;
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


	public static int[] separateDigits(int num) {
		int count=countDigits(num);
		int [] digitsArray=new int[countDigits(num)];
		for (int i=count-1;i>=0;i--) {
			digitsArray[i]=num%10;
			num=num/10;
		}
		return digitsArray;
	}
	public static int countDigits(int num) {
		num=convertPositive(num);
		int count=1;
		while ((num)>=10) {
			num=num/10;
			count++;	
		}
		return count;
	}
	public static int convertPositive(int num) {
		return (num<0)?num*-1:num;
	}
	
}