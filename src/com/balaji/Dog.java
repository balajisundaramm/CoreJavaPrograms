package com.balaji;

public class Dog{
	private String name;
	private int size;

public void setName(String str) {
	if (str!=null /*|| str!=""*/) {
		name=str;
	}
	else
		System.out.println("Give it a proper name");
}
public String getName() {
	return name;
}
public void setSize(int a) {
	if (a<=0) {
		System.out.println("It is not even born");
	}
	else
		size=a;
}
public int getSize() {
	return size;
}
	public void bark() {
		if (size>10) {
			System.out.println("I am a dog with size "+size+" barking meow");
		}
		else
		for (int i=1;i<=size;i++) {
			System.out.println("I am a dog with name "+name+" & with size "+size+" barking bow wow..");
		}
	}
}