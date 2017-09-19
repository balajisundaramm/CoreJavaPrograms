import java.util.Scanner;
public class StepsToProgramExcerciseUpgrade {
	public static boolean invalid;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner sc1= new Scanner(System.in);
		int choice=0;
		while(choice!=4){
			System.out.println("Please Enter an option");
		System.out.println("Press 1 to check prime number");
		System.out.println("Press 2 to check even");
		System.out.println("Press 3 to generate fibonacci");
		System.out.println("Press 4 to exit");
		 choice=sc.nextInt();
		int num=0;
		switch (choice) {
				case 1 : 
					System.out.println("Enter the number to check Prime");
					num = sc1.nextInt();
					boolean isPrime=isPrime(num);
					if (invalid) {
						System.out.println("Invalid input to check Prime");
						invalid=false;
					}
					else {
						System.out.println("The number, "+num+" is : " + (isPrime?"Prime":"not Prime"));
					}
					break;
				case 2 :
					System.out.println("Enter the number to check Even");
					num = sc1.nextInt();
					System.out.println("The number, "+num+" is : " + (isEven(num)?"Even":"not Even"));
					break;
				case 3 :
					System.out.println("Enter the limit to Print fibonacci");
					int limit = sc1.nextInt();
					printFibonacci(limit);
					break;
				case 4 :
					System.out.println("Thank y---ou ");
					System.exit(0);
			}	
		}
	}
	public static boolean isEven(int num) {
		return (num&1)==0;
	}
	public static boolean isPrime(int num) {
		if (!validatePrimeInput(num)) {
			invalid=true;
			return false;		}
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