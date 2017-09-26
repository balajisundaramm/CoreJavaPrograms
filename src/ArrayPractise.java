import java.lang.Math;
public class ArrayPractise{
	public static void main(String[] args) {
		//printArray();
		//storeReverse();
		//printRandomValues();
		/*int[] arr={10,20,30,40,50,60};
		test(arr);*/
		generateRandomStrings();
		/*int[] arr={10,20,30,40,50,60};
		System.out.println(add(arr));*/
		//printRandomColors();
	}
	public static void printArray() {
		int[] a=new int[10];
		for (int i=0; i<a.length;i++) {
			a[i]=i+1;
			System.out.println("The value of i = "+a[i]);
		}

		int[] a2={1,2,3,8,5,6,7};
		for (int x :a2 ) {
			System.out.println("The value ="+x);
		}
	}

	public static void storeReverse() {
		int[] arr=new int[10];
		int a=10;
		for (int i=0;i<arr.length;i++) {
			arr[i]=a--;
			System.out.println("The value is "+arr[i]);	
		}
		for (int x:arr) {
			System.out.println("The value for each "+x);
		}
	}

	public static void printRandomValues() {
		int[] a=new int[10];
		for (int i=0;i<a.length;i++) {
			int x=(int)(Math.random()*100);
			a[i]=x;
		}
		for (int i=0;i<a.length;i++) {
			System.out.println("Random value is "+a[i]);
		}
		for (int x :a ) {
			System.out.println("in for each "+x);
		}
	}

	public static void test(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			System.out.println("The value is "+arr[i]);
		}
		for (int x:arr) {
			System.out.println("The value in for each is "+x);
		}
	}


		public static String[] generateRandomStrings() {
			String[] a=new String[10];
			for (int i=0;i<10;i++) {
				String s="";
				for (int j=0;j<3;j++) {
					int x=(int)(Math.random()*256);
					char c=(char)x;
					s=c+s;
					a[i]=x+s;
				}
			}
				
			for (String x :a) {
				System.out.println(x);
			}
			return a;
		}
		public static int add(int[] a) {
			int sum=0;
			for (int i=0;i<a.length;i++) {
				sum=a[i]+sum;
			}
			return sum;
		}

		public static void printRandomColors() {
			String[] s={"White","Red","Blue","Green","Pink"};
			for (int i=0;i<s.length;i++) {
			int x=(int)(Math.random()*5);
			System.out.println("The random color from the given string is "+s[x]);
	
			}
		}



}






















