public class ArithmeticOperations{

	public static void main(String[] args) {

		/*for (int num : separateDigits(854321)) {
			System.out.println(num);
		}*/
			//System.out.println(toBinary(10));
		
			//System.out.println(toOctal(100));

			//System.out.println(toHexadecimal(26));

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

	
	public static String toBinary(int num) {
		String s="";
		while(num>0){
			s=(num%2)+s;
			num=num/2;
		}
		return s;
	}

	public static String toOctal(int num) {
		String s="";
		while(num>0){
			s=(num%8)+s;
			num=num/8;
		}
		return s;
	}

	public static String toHexadecimal(int num) {
		String s="";
		while(num>0){
			int b=(num%16);
			switch (b) {
				case 10:
					s="A"+s; 
					break;
				case 11:
					s="B"+s;
					break;
				case 12:
					s="C"+s; 
					break;
				case 13:
					s="D"+s; 
					break;
				case 14:
					s="E"+s; 
					break;
				case 15:
					s="F"+s; 
					break;
				default:
					s=b+s;
			}
			num=num/16;
		}
		return s;
	}
		
}