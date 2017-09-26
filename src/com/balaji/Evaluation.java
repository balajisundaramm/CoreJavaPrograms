package com.balaji;

public class Evaluation{
  public static void main(String[] args) {
   //int[] nums = {12,6,13,3};
	//System.out.println(tripleUp(nums)); 
	//System.out.println(sum28(nums));
   //System.out.println(haveThree(nums));
	 //System.out.println(stringE("oiheeebieklne"));

   //System.out.println(modThree(nums));

    //String str="Hnemlwlso";
    //String word="<<>>";
    //System.out.println(stringBits(str));
    //System.out.println(makeOutWord(word,str));

    //System.out.println(nTwice(str,2));

    System.out.println("\"hello\"");

 }
 public static boolean tripleUp(int[] nums) {
   int a=0, b=0, c=0;
   for(int i=0; i<(nums.length-2); i++){
    a=nums[i];
    b=nums[i+1];
    c=nums[i+2];
    if((b == (a+1)) && (c == (a+2)))
     return true;
 }
 return false;
}

public static boolean arrayFront9(int[] nums) {
  for(int i=0; i<=4; i++){
   if(nums[i]==9)
    return true;
}
return false;
}

public static boolean sum28(int[] nums) {
  int result=0;
  for(int i=0; i<nums.length; i++){
   if(nums[i]==2){
    result=result+nums[i];
  }
}
if (result==8) {
  return true;
}
return false;
}

public static boolean haveThree(int[] nums) {
  int a=0, b=0, c=0, count=0;
  for (int i=0;i<nums.length;i++) {
   if (nums[i]==3) {
    count++;
  }
}
for (int i=0;i<=(nums.length-5);i++) {
  a=nums[i];
  b=nums[i+2];
  c=nums[i+4];	
  if (count==3 && a==3 && b==3 && c==3) {
    return true;
  }
}

return false;  	
}
public static boolean stringE(String str) {
  int count=0;
  for (int i=0;i<str.length();i++) {
   if(str.charAt(i)=='e')
     count++;
 }
 if (count==3 || count==1) {
   return true;
 }
 return false;
}

    public static boolean modThree(int[] nums) {
      int countOdd=0, countEven=0;
      for (int i=0;i<nums.length;i++ ) {
        if ((nums[i]%2)==0) {
          countEven++;
        }
        if ((nums[i]%2)!=0) {
          countOdd++;
        }
      }
      if(countOdd==3 || countEven==3)
        return true;
      return false;
    }

    public static String stringBits(String str) {
      String result="";
      for (int i=0;i<str.length();i+=2) {
      result= result+str.charAt(i);
    }
    return result;

    }
    public static String makeOutWord(String out, String word) {
      String s1="";
      String s2="";
      String result="";
      s1=out.substring(0,2);
      s2=out.substring(2);
      result=s1+word+s2;
      return result;
      
   }

  public static String nTwice(String str, int n) {
    String result="";
    String s1=str.substring(0,n);
    String s2=str.substring(str.length()-n);
    result=s1+s2;
    return result;
  }


}
