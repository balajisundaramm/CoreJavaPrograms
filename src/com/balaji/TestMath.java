package com.balaji;

import java.lang.Math;

public class TestMath
{
	public static void main(String[] args)
	{
		int r= Math.min(-0, +0);
		//if(-5.0 == +5.0)
		System.out.println(r);
		double x = 140;
		double res = Math.sqrt(x);
		System.out.println("sqrt of "+x+" = "+res);
		res = Math.cbrt(x);
		System.out.println("cbrt of "+x+" = "+res);
		int y;
		// generate random int values between 1 - 100
		for(int i = 0 ; i < 10 ; i++)
		{
			y = (int) (Math.random() * 100); // 0 - 1
			System.out.println("random "+y);
		}

		res=Math.pow(3,4);
		System.out.println("3 power 4 = "+res);
		res=Math.floor(9.9999);
		System.out.println("Floor of 9.9999 is "+res);
		res=Math.ceil(9.0009);
		System.out.println("ceiling of 9.0009 is "+res);
		res=Math.round(9.5);
		System.out.println("Round value of 9.5 is "+res);
		res=Math.round(9.49);
		System.out.println("Round value of 9.49 is "+res);
		res=Math.abs(+9.999);
		System.out.println("Abs value of +9.999 is "+res);
		res=Math.abs(-9.999);
		System.out.println("Abs value of -9.999 is "+res);

	}
}





