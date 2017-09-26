//3) WAP to test whether an int num is prime !

public class Prime{
	public static void main(String[] args) {
		System.out.println("Invoking isPrime method");
		System.out.println("The number, -5 is : " + (isPrime(-5)?"Valid":"Invalid"));
		System.out.println("The number, 0 is : " + (isPrime(0)?"Prime":"not Prime"));
		System.out.println("The number, 1 is : " + (isPrime(1)?"Prime":"not Prime"));
		System.out.println("The number, 2 is : " + (isPrime(2)?"Prime":"not Prime"));
		System.out.println("The number, 3 is : " + (isPrime(3)?"Prime":"not Prime"));
		System.out.println("The number, 5 is : " + (isPrime(5)?"Prime":"not Prime"));
		System.out.println("The number, 7 is : " + (isPrime(7)?"Prime":"not Prime"));
		System.out.println("The number, 108 is : " + (isPrime(108)?"Prime":"not Prime"));
		System.out.println("The number, -1>>>1 is : " + (isPrime(-1>>>1)?"Prime":"not Prime"));
		System.out.println("The number, 15 is : " + (isPrime(15)?"Prime":"not Prime"));
		System.out.println("The number, 17 is : " + (isPrime(17)?"Prime":"not Prime"));
		System.out.println("The number, 101 is : " + (isPrime(101)?"Prime":"not Prime"));
		
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

	public static boolean validatePrimeInput(int num) {
		return num>=0;
	}

	public static boolean isEven(int num) {
		return (num&1)==0;
	}
}