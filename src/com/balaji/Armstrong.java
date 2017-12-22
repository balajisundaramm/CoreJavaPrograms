package com.balaji;/*An Armstrong number of three digits is an integer such that the sum of the cubes of its
digits is equal to the number itself. For example, 371 is an Armstrong number since
3**3 + 7**3 + 1**3 = 371. Write a program to find th:src="@{ Armstrong number in the range of
0 and 999.*/

public class Armstrong{
	public static void main(String[] args) {

		checkArmstrong();
	}

	public static void checkArmstrong() {
	System.out.println("Armstrong numbers from 0 to 999:");
		int i,n,r,t;
		for(i=0;i<1000;i++){
			t=i;
			n=0;
			while(t>0){
				r=t%10;
				n=n+r*r*r;
				t=t/10;
			}
			
			if(i==n){
				System.out.println(i);
			}
		}

		}
}