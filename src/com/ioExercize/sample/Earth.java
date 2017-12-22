package com.uttara.io;

//Singleton class
public class Earth {
	
	//1.mark constr private
	private Earth()
	{
		System.out.println("in Earths constr");
	}
	//2.create private static Earth obj ref var
	private static Earth obj=null;

	//3.expose a static getInstance() method
	public static Earth getInstance()
	{
		//if(obj == null)
			obj = new Earth(); //lazy initialization
		
		return obj;
	}
}
class TestSingleton
{
	public static void main(String[] args) {
		Earth e1 = Earth.getInstance();//new Earth();
		Earth e2 = Earth.getInstance();
		
		System.out.println("is e1==e2 ? "+(e1==e2));
	}
}




