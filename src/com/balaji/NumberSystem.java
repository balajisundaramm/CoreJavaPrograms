package com.balaji;

/*13.WAP to generate: !
a) the binary number representation for an int number!
b) the hexadecimal representation for an int number!
c) the octal representation for an int number!
*/
public class NumberSystem{
	public static void main(String[] args) {
		int num=10;
		System.out.println("The binary representation of the number "+num+" is "+toBinary(num));
		num=100;
		System.out.println("The octal representation of the number "+num+" is "+toOctal(num));
		num=26;
		System.out.println("The hexadecimal representation of the number "+num+" is "+toHexadecimal(num));
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