import java.lang.reflect.Array;

public class CodeEvalve{
	public static void main(String[] args) {
	//arraysum(a[]={1,2,3,4,5});	
	
	/*public static long arraySum(int[] a){
		long result=0;
		for (int i=a.length-1;i>=0 ;i-- ) {
			result= a[length-1]+a[i-1]
		}
	}*/
	for (int x:generateFibSeries(10)) {
			System.out.print(x+" ");
		}


		/*String s1="World";
		String s2="War world";
		String s3="WORLD";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.concat(s2));
		System.out.println(s1.charAt(3));
		System.out.println(s1.indexOf('l'));
		System.out.println(s1.indexOf("or"));
		System.out.println(s2.indexOf('w',3));
		System.out.println(s2.startsWith("Wa"));
		System.out.println(s2.endsWith("wo"));
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s1.equals(s3));
		System.out.println(s1.length());
		*/

		//System.out.println(interchangeFirstAndLast("ad"));
/*
		int [] a=new int[5];
		a[0]=0;
		a[1]=1;
		for (int i=2;i<5;i++) {
			a[i]= a[0]+a[1];
		
		System.out.print(a[i]+"");
	}*/
	}

	public static int[] generateFibSeries(int limit){
		int[] result= new int[limit];
		result[0]=0;
		result[1]=1;
		int a=0, b=1;
		while (limit>=3) {
			for (int i=2;i<(limit);i++) {
				result[i]=a+b;
				a=b;
				b=result[i];
			}
			break;
		}
		
		/*for (int x :result ) {
			System.out.print(x+" ");
		}*/
		
   		return result;
			
	} 

	/*public static String interchangeFirstAndLast(String s) {
		//char first=s.charAt(0);
		//char last=s.charAt(s.length()-1);
		//char c=first;
		String b=s.substring(1,s.length()-1);
		String a=s.charAt(s.length()-1)+b+s.charAt(0);
		//a=s.replace(last,c);
		return a;
	}*/
}