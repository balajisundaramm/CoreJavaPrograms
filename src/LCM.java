//10)WAP to identity the LCM of 2 int numbers

public class LCM{
	public static void main(String[] args) {
		int num1,num2;
		num1=3;
		num2=5;
		System.out.println("LCM of the given numbers -->"+num1+", "+num2+" is "+findLCM(num1,num2));
		num1=5;
		num2=5;
		System.out.println("LCM of the given numbers -->"+num1+", "+num2+" is "+findLCM(num1,num2));
		num1=13;
		num2=36;
		System.out.println("LCM of the given numbers -->"+num1+", "+num2+" is "+findLCM(num1,num2));
		num1=1;
		num2=21;
		System.out.println("LCM of the given numbers -->"+num1+", "+num2+" is "+findLCM(num1,num2));
	}
	public static int findLCM(int num1, int num2) {
		int lcm=1;
		int gcd=findGCD(num1,num2);
		lcm=((num1*num2)/gcd);
		return lcm;
	}
	public static int findGCD(int num1, int num2) {
		
		int gcd=1;
		if(num1==num2)
			return num1;
		else {
			int low=num1>num2?num2:num1;
			for(int i=2; i<=low; i++){
				if(((num1%i)==0) && ((num2%i)==0)){
					gcd=i;
				
				}

			}
			return gcd;
		}
		
	}
}