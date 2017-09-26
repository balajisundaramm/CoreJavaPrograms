package com.balaji;

public class Math{
	public static void main(String[] args) {
		
		
		System.out.println(printFactorial(6));
		
	}
	public static int printFactorial(int num){
		int i=1, a=1;
		for(i=1; i<=num; i++){
			a=a*i;
		}
		return a;
		
	}
}