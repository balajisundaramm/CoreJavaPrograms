//5) WAP to test whether an int is a power of 2 !

public class PowersOfTwo{
	public static void main(String[] args) {
		int num;
		String result;
		num=-5;
		result= findPowersOfTwo(num);
		System.out.println(num +" --> "+result);

		num=1;
		result= findPowersOfTwo(num);
		System.out.println(num +" --> "+result);

		num=5;
		result= findPowersOfTwo(num);
		System.out.println(num +" --> "+result);

		num=60;
		result= findPowersOfTwo(num);
		System.out.println(num +" --> "+result);

		num=64;
		result= findPowersOfTwo(num);
		System.out.println(num +" --> "+result);

		num=-1>>>1;
		result= findPowersOfTwo(num);
		System.out.println(num +" --> "+result);
	}

	public static String findPowersOfTwo(int num) 
	{

		if(num<0)
			return "Invalid";
		if(num==1 || num==2 || num==4 || num==8)
			return "Yes, The given number is powers of 2";
		if(num==0 || num==3 || num==5 || num==6)
			return "No, The given number is not powers of 2";

		if(num%2==0)
		{
			for(int a=4; a<num; a*=2)
			{
				if(num%a!=0)
					return "No, The given number is not powers of 2";
			}
					return "Yes, The given number is powers of 2";
		}
		else
			
			return "No, The given number is not powers of 2";		
	}
}