package com.balaji;

/**
 * Created by Balaji on 15/10/17.
 */
public class ReversePyramid {
    public static void main(String[] args) {
        printReversePyrmid(7);
    }

    public static void printReversePyrmid(int row) {
        for (int i = 0; i < row ; i++) {
            for (int colSpace = (row-i); colSpace<row ; colSpace++) {
                System.out.print(" ");
            }
            for (int j = 0; j <(row-i) ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
