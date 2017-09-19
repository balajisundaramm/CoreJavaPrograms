public class Simple{
	public static void main(String[] args) {
		printOddNotDivisibleByThree(5);
		isPowerOfThree(30);
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
		int quo=4;
		if(a%3!=0)
			System.out.println("The number "+a+" is not power o 3");
		else
			quo=a/3;
			while(quo>=3){
				quo=quo/3;
		}
		System.out.println("The number "+a+" is power of 3");
	}
}