public class TestLoop{
	public static void main(String[] args) {
		/*

		for(int i=1; i<=35; i++){
			if((i%11)!=0)
				System.out.print(i+"");
			else
				System.out.println();
		}
		*/
		//System.out.println("Total days in the year, 1992 is : " + (calculateNoOfDays(1992)?"366":"not 365"));
		//System.out.println("Total days in the year, 2002 is : " + (calculateNoOfDays(2002)?"366":"not 365"));

		//System.out.println("The number, 7 is : " + (isEven(7)?"Shampoo":"Govinda"));
		/*
		printEven(2);
		printEven(5);
		printEven(6);
		printEven(3);
		printEven(4);
		*/
		printCharSymbol();

	}3
	public static int multiplyEleven(int a, int b){
		int c=0;
		for(a=1; a<=100; a++){
			for(b=11; b<=11; b++){
				System.out.println(a+ " * " +b +" = " +(a*b));
				c=(a*b);
			
			}
		}return c;
	}
	public static boolean calculateNoOfDays(int year) {
			return ((year%400)==0) || (((year%100)!=0) && ((year%4)==0));
		
	}

	public static void printEven(int num) {
		if((num&1)==0){
			for(int i=1; i<=num; i++){
				System.out.println("Shampoo");
			}
		}
		else{
			for (int i=1; i<=num; i++){
				System.out.println("Govinda");
			}
		}
	}

	public static void printTraingle() {
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print(j);
			}	
				System.out.println(" ");
		}
	}

	public static void reverseTriangle() {
		for(int i=7; i>=1; i--){
			for(int j=1; j<=i; j++){
			System.out.print(j);
		}
		System.out.println("");
		}
	}
	public static void printCharSymbol() {
		char c;
		for(c=1; c<=67; c++){
			if((c%5)!=0)
			System.out.print(c+" ");
		}
	}
	public static void printStar() {
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				System.out.print("* ");
			}	
				System.out.print(" ");
				System.out.println("");
		}
	}
		
}
