public class Twenty{
	public static void main(String[] args) {
		//int[] nums={6,6,1,6,7,5};
		//System.out.println(only14(nums));
		//System.out.println(more14(nums));
		/*for (int x :swapEnds(nums)) {
			System.out.println(x);
		}*/
		//System.out.println(array667(nums));

		//System.out.println(twoAsOne(5,9,2));

		//System.out.println(countXX("xxaxxx"));

		
		/*for (String x :fizzArray2(4)) {
			System.out.println(x);
		}
		String tag="i";
		String word="hello";
		System.out.println(makeTags(tag,word));*/

		int[] nums={3,4,2,3,1};
		System.out.println(has12(nums));

	}
	public static boolean only14(int[] nums) {
		for(int x: nums){
			if(x!=1 && x!=4)
				return false;
		}
		return true;
	}

	public static boolean more14(int[] nums){
		int countOne=0;
		int countFour=0;
		for (int x:nums) {
			if(x==1)
				countOne++;
			if(x==4)
				countFour++;
		}
		if (countOne>countFour) {
			return true;
		}
		return false;
	}

	public static int[] swapEnds(int[] nums) {
		int[] result=new int[nums.length];
		for (int i=0;i<nums.length;i++) {
			result[i]=nums[i];
		}
		result[0]=result[0]^result[result.length-1];
		result[nums.length-1]=result[0]^result[result.length-1];
		result[0]=result[0]^result[result.length-1];

		return result;
	}

	public static int array667(int[] nums) {
		int count=0;
		for (int i=0;i<nums.length;i++) {
			if (nums[i] ==6 && nums[i+1] ==6){
				count++;
			}
			if (nums[i] ==6 && nums[i+1] ==7){
				count++;
			}
		}
		return count;
	}

	public static boolean twoAsOne(int a, int b, int c) {
		if((a+b)==c)
			return true;
		if((a+c)==b)
			return true;
		if((b+c)==a)
			return true;
		else
			return false;
	}

	public static int countXX(String str){
		int count=0;
		for (int i=0;i<(str.length()-1);i++) {
			if (str.charAt(i)=='x' && str.charAt(i+1)=='x')
				count++;
		}
		return count;
	}

	public static String[] fizzArray2(int n) {
		String[] result=new String[n];
		for (int i=0;i<n;i++) {
			result[i]=String.valueOf(i);
		}
		return result;
	}

	public static String makeTags(String tag, String word) {
		String result="";
		result="<"+tag+">"+word+"</"+tag+">";
		return result;
	}

	public static boolean has12(int[] nums){
		int c1=0,c2=0;
		for(int x:nums)
			{if(x==1)
				c1++;
				if(x==2)
					c2++;}
				if(c1>0&&c2>0)
					return true;
				else return false;
			}
		}


