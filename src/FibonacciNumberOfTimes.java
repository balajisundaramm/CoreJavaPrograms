//8) WAP to generate n number of fibonacci sequence, given n

public class FibonacciNumberOfTimes{
	public static void main(String[] args) {
		
		System.out.println("Printing 1 number of fibonacci sequence: ");
		creatN_NumberOfFibonacci(1);
		System.out.println("Printing 2 numbers of fibonacci sequence: ");
		creatN_NumberOfFibonacci(2);
		System.out.println("Printing 4 numbers of fibonacci sequence:");
		creatN_NumberOfFibonacci(4);
		System.out.println("Printing 10 numbers of fibonacci sequence: ");
		creatN_NumberOfFibonacci(10);
		System.out.println("Printing 80 numbers of fibonacci sequence: ");
		creatN_NumberOfFibonacci(80); //(Max -->80 numbers)
		System.out.println("Printing fibonacci sequence for -3: ");
		creatN_NumberOfFibonacci(-3);
	}
	public static void creatN_NumberOfFibonacci(int num) {
		if (num>0) {
			int i=3;
			long a=1, b=1, c=0;
			if(num==1)
				System.out.println(a+" ");
			if(num==2){
				System.out.print(a+" ");
				System.out.println(b+" ");
			}
			if(num>=3){
				System.out.print(a+" ");
				System.out.print(b+" ");
			}
			for(i=3; i<=num; i++){
				c=a+b;
				System.out.print(c+" ");
				a=b;
				b=c;
			}
			System.out.println("");
		}
		else 
			System.out.println("Invalid input");
	} 

}