package com.mtrixProblems;

import java.util.Scanner;

/**
 * Created by Balaji on 6/11/17.
 */
public class AdditionSubtraction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of rows");
        int r=sc.nextInt();
        System.out.println("enter the no of columns");
        int c=sc.nextInt();
        int[][] first=new int[r][c];
        int[][] second=new int[r][c];
        int[][] sum=new int[r][c];

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
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                sum[i][j]=first[i][j]+second[i][j];
            }
        }

        System.out.println("The result of addition matrix is..");
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }

        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                sum[i][j]=first[i][j]-second[i][j];
            }
        }

        System.out.println("The result of subtraction matrix is..");
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }




    }

}
