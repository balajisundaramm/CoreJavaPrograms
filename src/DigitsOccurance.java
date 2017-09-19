// 
public class DigitsOccurance{
	public static void main(String[] args) {
		//System.out.println(findDigitsCount(1233622,2));
		System.out.println(checkSameDigits(122,212));

		/*System.out.println("Number of ones in "
			+ArithmeticOperations.toBinary(11)+
			" is "+
			findDigitsCount(Integer.parseInt(ArithmeticOperations.toBinary(11)),1));*/


	}

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

//
	public static boolean checkSameDigits(int num1, int num2) {
		int [] num1Digits=ArithmeticOperations.separateDigits(num1);
		int [] num2Digits=ArithmeticOperations.separateDigits(num2);
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
}