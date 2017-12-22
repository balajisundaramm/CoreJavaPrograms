package com.mtrixProblems;

import java.util.Scanner;

/**
 * Created by Balaji on 6/11/17.
 */
public class Multiplication {
    static int r;
    static int c;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of rows");
        r = sc.nextInt();
        System.out.println("enter the no of columns");
        c = sc.nextInt();
        int[][] first = new int[r][c];
        int[][] second = new int[c][r];
        int[][] res;

        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                System.out.println("Enter the elements of the first matrix");
                first[i][j]=sc.nextInt();
            }
        }

        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                System.out.println("Enter the elements of the second matrix");
                second[i][j]=sc.nextInt();
            }
        }
        System.out.println("The multiplied matrix is...");
        res=multiply(first,second);
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <r ; j++) {
                System.out.print(res[i][j]+"\t");
            }
            System.out.println();
        }

    }

    public static int[][] multiply(int[][] first, int[][] second) {
        int[][] res=new int[r][r];
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <r; j++) {
                for (int k = 0; k <r ; k++) {
                    res[i][j] =res[i][j]+(first[i][k] * second[k][j]);
                }
            }
        }
        return res;
    }

}
