/*17)WAP to test whether 2 numbers given as inputs contains the same digits, for ex: 121,
112, 211 contain the same digits.!

18)WAP to accept 1 int number and another a digit (given also as an int). Return how
manes time the second parameter occurs in the first number. Ex: 2224, 2 -> 2 occurs 3
times!*/

public class SameDigitOccurance{
	public static void main(String[] args) {
		
		System.out.println("Invoking checkSameDigits method");
		int num1, num2;
		num1=122;
		num2=212;
		System.out.print("The numbers -->"+num1+", "+num2);
		System.out.println(checkSameDigits(num1, num2)?" contain same digits":" don't contain same digits");
		num1=123; 
		num2=212;
		System.out.print("The numbers -->"+num1+", "+num2);
		System.out.println(checkSameDigits(num1, num2)?" contain same digits":" don't contain same digits");
		num1=122;
		num2=232;
		System.out.print("The numbers -->"+num1+", "+num2);
		System.out.println(checkSameDigits(num1, num2)?" contain same digits":" don't contain same digits");


		System.out.println("Invoking find digits count method");
		int num, param;
		num=12335622;
		param=2;
		System.out.println("The parameter "+param+"-->"+findDigitsCount(num,param)+" time/times occurs/occur in "+num);
		param=3;
		System.out.println("The parameter "+param+"-->"+findDigitsCount(num,param)+" time/times occurs/occur in "+num);


	}

/*18)WAP to accept 1 int number and another a digit (given also as an int). Return how
manes time the second parameter occurs in the first number. Ex: 2224, 2 -> 2 occurs 3
times!*/
	public static boolean checkSameDigits(int num1, int num2) {
		int [] num1Digits=separateDigits(num1);
		int [] num2Digits=separateDigits(num2);
		outer: for (int num1Digit:num1Digits) {
			inner: for (int i=0;i<num2Digits.length;i++){	
			
				if (num1Digit!=num2Digits[i]) {
					continue inner;

				}else{
					num2Digits[i]=-121;
					continue outer;
				}

					
			}
			return false;
		}
		return true;
	}
/*17)WAP to test whether 2 numbers given as inputs contains the same digits, for ex: 121,
112, 211 contain the same digits.!*/
	public static int findDigitsCount(int num, int param) {
		int count=0;
		int [] digits=ArithmeticOperations.separateDigits(num);
		for (int digit : digits) {
			if (digit==param) {
				count++;
			}
		}
		return count;

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