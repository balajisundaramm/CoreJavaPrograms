package com.balaji;

public class MultidimentionalArray{
	public static void main(String[] args) {
		printMultiArray();
	}
	public static void printMultiArray() {
		int[][
				] a = new int[3][2];
		/*int b=new int[2];
		b[0]=10;
		b[1]=20;*/
		for (int i=0;i<a.length;i++) {
			int [] na= a[i];
			for (int j=0;j<na.length ;j++) {
				a[i][j]=i+j;
			}
		}
	}
}