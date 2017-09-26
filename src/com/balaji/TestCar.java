package com.balaji;

public class TestCar{
	public static void main(String[] args) {
		Car c=new Car();
		c.setName("Audi");
		c.setFuelQty(1);
		c.start();
		c.drive();
		c.refill(3);
		c.start();

		c.drive();

		c.reverse();
		c.stop();
	}
}