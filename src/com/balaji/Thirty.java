package com.balaji;

public class Thirty{
	public static void main(String[] args) {
		/*String str="elderly";
		System.out.println(endsLy(str));
		System.out.println(str.length());
*/
		/*int[] nums={2,2,3,7,6,2,2};
		System.out.println(either24(nums));*/

		//String str="Chocolate";
		//System.out.println(altPairs(str));
		//System.out.println(lastTwo(str));

		/*String str="xChocolatex";
		System.out.println(withoutX(str));

		str="Chocolatex";
		System.out.println(withoutX(str));

		str="xChocolate";
		System.out.println(withoutX(str));

		str="Chocolate";
		System.out.println(withoutX(str));*/
		/*String a="Testing";
		String b="New";
		System.out.println(nonStart(a,b));*/

		System.out.println(in3050(45,50));
		System.out.println(in3050(35,40));
		System.out.println(in3050(35,50));
		System.out.println(in3050(45,60));
		System.out.println(in3050(25,50));

	}
//31
	public static boolean endsLy(String str) {
		int result=str.indexOf("ly", (str.length()-2));
		System.out.println("result = "+result);
		/*if (result==(str.length()-2)) {
			return true;
		}*/
		if (result==-1) {
			return false;
		}
		return true;
	}
//32
	public static boolean either24(int[] nums) {
		/*boolean flag2=false;
		boolean flag4=false;
  		for (int i=0;i<nums.length-1;i++) {
  		 	if (nums[i]==2 && nums[i+1]==2)
  		 		flag2=true;
  		 	if (nums[i]==4 && nums[i+1]==4)
  		 		flag4=true;	
  		}
  		return ((flag2!=flag4)?true:false);
  	}*/
// Gokul bug  
  	int c=0;
  	for(int i=0;i<nums.length-1;i++){
  		if((nums[i]==2 && nums[i+1]==2) || (nums[i]==4 && nums[i+1]==4))
  			c+=1;
  	} 
  	return (c==1);
  }
//33
  public static String altPairs(String str) {
  	String result="";
  	int pos=0;
  	for (int i=0;i<str.length();i+=4) {
  			/*if (i!=str.length()-1) {
  				pos=(i+2);
  			}
  			else
  			pos=str.length();*/
  			pos=(i!=str.length()-1)?(i+2):str.length();
  			result=result+str.substring(i,pos);
  		}
  		return result;
  	}
//34
  	public static String lastTwo(String str) {
  		String result="";
  		/*String Swapping*/
  		char var=str.charAt(str.length()-2);
  		char penultimate=str.charAt(str.length()-1);
  		char ultimate=var;
  		result=result+str.substring(0,(str.length()-2))+penultimate+ultimate;
  		return result;
  	}
//35
  	/*public static String withoutX(String str) { 
  		String result="";
  		if (str.charAt(0)!='x' && str.charAt(str.length()-1)!='x')
  			result=str;
  		if (str.charAt(0)=='x')
  			result=(str.charAt(str.length()-1)=='x')?str.substring(1,str.length()-1):str.substring(1,str.length());
  		if (str.charAt(str.length()-1)=='x')
  			result=(str.charAt(0)=='x')?str.substring(1,str.length()-1):str.substring(0,str.length()-1);
  		return result;

// another solution
  		if(str.charAt(0)=='x'&&str.charAt(str.length()-1)=='x')
  			return str.substring(1,str.length()-1);
  		else if(str.charAt(0)=='x')
  			return str.substring(1,str.length());
  		else if(str.charAt(str.length()-1)=='x')
  			return str.substring(0,str.length()-1);
  		else return str;
  	}*/

  	public static String nonStart(String a, String b) {
  		return (a.substring(1)+b.substring(1));
	}

	public static boolean in3050(int a, int b) {
  		if ((a>=30 && a<=40) && (b>=30 && b<=40)) 
  			return true;
    	if ((a>=40 && a<=50) && (b>=40 && b<=50)) 
    		return true;
    	else
    		return false;

	}






  }