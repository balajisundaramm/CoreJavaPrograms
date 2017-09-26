public class StepsToProgramExcercise {
	public static void main(String[] args) {
		//Invoking isEven method

		System.out.println("Invoking isEven method");
		System.out.println("The number, 7 is : " + (isEven(7)?"Even":"not Even"));
		System.out.println("The number, 4 is : " + (isEven(4)?"Even":"not Even"));
		System.out.println("The number, 0 is : " + (isEven(0)?"Even":"not Even"));
		System.out.println("The number, 2147483647 is : " + (isEven(2147483647)?"Even":"not Even"));
		System.out.println("The number, -4 is : " + (isEven(-4)?"Even":"not Even"));
		System.out.println("The number, -2147483648 is : " + (isEven(-2147483648)?"Even":"not Even"));

		//Invoking isPrime method

		System.out.println("Invoking isPrime method");
		System.out.println("The number, -5 is : " + (isPrime(-5)?"Valid":"Invalid"));
		System.out.println("The number, 0 is : " + (isPrime(0)?"Prime":"not Prime"));
		System.out.println("The number, 1 is : " + (isPrime(1)?"Prime":"not Prime"));
		System.out.println("The number, 2 is : " + (isPrime(2)?"Prime":"not Prime"));
		System.out.println("The number, 3 is : " + (isPrime(3)?"Prime":"not Prime"));
		System.out.println("The number, 5 is : " + (isPrime(5)?"Prime":"not Prime"));
		System.out.println("The number, 7 is : " + (isPrime(7)?"Prime":"not Prime"));
		System.out.println("The number, 108 is : " + (isPrime(108)?"Prime":"not Prime"));
		System.out.println("The number, 2147483647 is : " + (isPrime(2147483647)?"Prime":"not Prime"));
		System.out.println("The number, 15 is : " + (isPrime(15)?"Prime":"not Prime"));
		System.out.println("The number, 17 is : " + (isPrime(17)?"Prime":"not Prime"));
		System.out.println("The number, 101 is : " + (isPrime(101)?"Prime":"not Prime"));
		
		//Invoking printFibonacci method

		System.out.println("Invoking printFibonacci method");
		System.out.println("Printing fibonacci for -4 : ");
		printFibonacci(-4);
		System.out.println("Printing fibonacci upto 6 : ");
		printFibonacci(6);
		System.out.println("Printing fibonacci upto 89 : ");
		printFibonacci(89);
		System.out.println("Printing fibonacci upto 152: ");
		printFibonacci(152);
		System.out.println("Printing fibonacci upto 2147483647 : ");
		printFibonacci(2147483647);		
	}
	public static boolean isEven(int num) {
		return (num&1)==0;
	}
	public static boolean isPrime(int num) {
		if (!validatePrimeInput(num)) {
			return false;
		}
		if (num == 0 || num == 1)
			return  false;
		if (num == 2 || num == 3 || num == 5 || num == 7)
			return true;
		if(isEven(num))
			return false;
		for (int i=3; i<=(num/2); i+=2) {
			if (num%i == 0)
				return false;
		}
		return true;
	}
	public static void printFibonacci(int limit) {
		if (limit>0) {
			long a = 1, b=1;
			long c=0;
			System.out.print(a+" ");
			System.out.print(b+" ");
			while(limit>=(c=a+b)) {
				System.out.print(c+" ");
				a=b;
				b=c;
			}
			System.out.println("");
		}else {
			System.out.println("Invalid input");
		}
	}		
	public static boolean validatePrimeInput(int num) {
		return num>=0;
	}
}