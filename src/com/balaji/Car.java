package com.balaji;

public class Car{
	private String name;
	private int fuelQty;
	private boolean state;

	public void setName(String str) {
		if (str!=null) {
			name=str;
		}
		else
			System.out.println("Give it a proper name");
	}
	public String getName() {
		return name;
	}
	public void setFuelQty(int a) {
		if (a<=0) {
			System.out.println("Give it a valid fuel quantity");
		}
		else
			fuelQty=a;
	}
	public int getFuelQty() {
		return fuelQty;
	}
	public boolean getState(){
		return state;
	}
	public void start() {
		if(fuelQty>0){
			System.out.println("The car is started");
			state=true;
		}
	}
	public void drive(){
		if (!state) {
			System.out.println("First start the car and then drive");
		}
		else
			if (state) {
				if (fuelQty==0) {
					System.out.println("First fill the fuel and then drive");
				}
				if (fuelQty>0) {
					System.out.println("The car with name "+name+" driving ");
					fuelQty--;
					System.out.println("Fuel quantity is "+getFuelQty());
					if (fuelQty==0) {
						stop();
					}
				}

			}
		
	}
		public void stop() {
			state=false;
		}
		public void reverse() {
			if (!state) {
				System.out.println("First start the car and then reverse");
			}
			else
				if (state) {
					if (fuelQty==0) {
						System.out.println("First fill the fuel and then reverse");
					}
					if (fuelQty>0) {
						System.out.println("The car with name "+name+" reversing ");
						fuelQty--;
						System.out.println("Fuel quantity is "+getFuelQty());
						if (fuelQty==0) {
							stop();
							System.out.println("First fill the fuel then start the car and drive");
						}
					}

				}
			
		}
		public void refill(int qty) {
			if (qty<=0) {
				System.out.println("Give it a valid quantity.");
		}
		else
			fuelQty=fuelQty+qty;

		}
}