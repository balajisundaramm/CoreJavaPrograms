package com.balaji;

public class MethodTest{
	public static void main(String[] args) {
	System.out.println("Before Invoking");
	int x=print();
	System.out.println(x);	
	}
	public static int print() {
		if(1!=2)
			return 1;
		else 
			return 0;
	}
			
}