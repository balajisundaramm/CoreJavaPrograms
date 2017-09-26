public class TestString
{
	public static void main(String[] args)
	{
		String s1 = "happy deepavali";
		
		System.out.println("s1.length() = "+s1.length());
		
		char c = s1.charAt(0);
		System.out.println("c = "+c);
		for(int i = 0 ; i < s1.length() ; i++)
		{
			c = s1.charAt(i);
			System.out.println("c = "+c);	
		}
		char[] ca = s1.toCharArray();
		
		System.out.println("using char array...");
		
		for(char x : ca)
		{
			System.out.println("x = "+x);
		}
		
		String s2 = "deepa";
		
		//s2.toLowerCase()
		
		System.out.println("searching "+s2+" in "+s1 +" = "+s1.contains(s2));
		System.out.println("searching "+s2+" in "+s1 +" = "+s1.indexOf(s2,0));
		
		String s3 = "adc";
		String s4 = "adcaz";
		
		System.out.println("comparing "+s3 +" with "+ s4 +" = "+s3.compareTo(s4));
		
		String s5 = "mogambo";
		String s6 = new String("mogambo");
		
		System.out.println("checking s5==s6 "+(s5==s6));
		System.out.println("checking s5.equals(s6) "+s5.equals(s6)+" compareto "+s5.compareTo(s6));
		
		String s7 = "kattappa kyon maara?";
		
		System.out.println("replacing a with oo for "+s7+" = "+ s7.replace("a","oo"));
		
		String s8 = "    hello hai   ";
		System.out.println("s8.trim() = "+s8.trim());
		
		String s9 = "happy yo #$%^123";
		System.out.println("s9.toUpperCase() = "+s9.toUpperCase());
		
		String s10 = "the distance between Johnson and and and and and Johnson is not the same";
		String[] sa = s10.split("and");
		System.out.println("sa.length = "+sa.length);
		for(String str : sa)
		{
			System.out.println("str = "+str);
		}
		
	}

}




