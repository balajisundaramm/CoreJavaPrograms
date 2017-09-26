package com.balaji;

public class Pen{
	private int inkQty;
	String color;
	private String name;

	public void setInkQty(int a) {
		if (a>0 && a<16) {
			inkQty=a;
		}
		else
			System.out.println("Give it a valid inkQty(1 to 15)");
	}
	public int getInkQty() {
		return inkQty;
	}
	public void setName(String s) {
		if (s!=null) {
			name=s;
		}
		else
			System.out.println("Give it a proper name");
	}
	public String getName() {
		return name;
	}
	public void write() {
		if (inkQty>0) {
			System.out.println("Pen with name "+name+" writing, Have a nice day.");
			inkQty--;
			System.out.println("Ink quantity = "+getInkQty());
		}
		else
			System.out.println("First refill and then write.." );
			System.out.println("Ink quantity= "+getInkQty());
		
	}
	public void refill(int qty) {
		if (qty<=0) {
			System.out.println("Give it a valid quantity.");
		}
		else
			inkQty=inkQty+qty;

	}
}
