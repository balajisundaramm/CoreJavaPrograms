public class PracticeMultiply{

	public static void main(String[] args){
		int a=10;
		int b=20;
		int c=multiplication(a,b);

		System.out.println("Multiplication of the given numbers is "+c);
	}
	public static int multiplication(int a, int b){
		int c=0;
		c=a*b;
		return c;
	}
}