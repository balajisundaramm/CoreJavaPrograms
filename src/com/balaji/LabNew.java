package com.balaji;

public class LabNew{
	public static void main(String[] args) {
	/*	
	int x=10;
	System.out.println("before invoking "+x);	
	int y=process(x);
	System.out.println("after invoking "+y);
	*/
	//int a=5;
	//int y=printTables(a);

	int a=0xb;
	System.out.println(a);
	}
	public static int process(int a) {
		a=20;
		System.out.println("In process "+a);
		int z=operation(a);
		System.out.println("After invoking operation"+z);
		return z;
	}
	public static int operation(int num) {
		num=55;
		System.out.println("In operation "+num);
		return num;
	}
	/*public static int printTables(int num) {
			for(int i=1; i>=10; i++){
				int x=i*num;
				System.out.println(i+" * "+num+" = "+x);
				return x;
			}
	}*/
}