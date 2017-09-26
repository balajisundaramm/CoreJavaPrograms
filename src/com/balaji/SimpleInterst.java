package com.balaji;

public class SimpleInterst{
	
	public static void main(String[] args){
		int p=20500;
		double r=6.5;
		double n=1.6;
		double SI= CalculateSI(1235,2.6,3.0);


		//double SI= CalculateSI(args[0],args[1],args[2]);

		System.out.println(args[0]);
		System.out.println("SI is "+SI);
	}
	public static double CalculateSI(int p, double r, double n){
		double SI=0;
		SI = (p*n*r)/100;
		return SI;
	}
}

