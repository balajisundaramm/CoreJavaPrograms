package com.balaji;

/**
 * Created by Balaji on 15/10/17.
 */
public class Triangle {
    public static void main(String[] args) {
        //printTriangle(3);
        printMirrorTriangle(3);
    }

    public static void printTriangle(int row) {
        for (int i = 0; i <row ; i++) {
            for (int j = (row-i); j <=row ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printMirrorTriangle(int row) {

        for (int i = 0; i <row ; i++) {
            for (int colSpace = (i*2); colSpace < ((row*2)-2) ; colSpace++) {
                System.out.print(" ");
            }
            for (int j = (row-i); j <=row ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
