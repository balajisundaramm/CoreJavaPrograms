package com.mtrixProblems;

import java.util.Scanner;

/**
 * Created by Balaji on 6/11/17.
 */
public class Test {

    static int r;
    static int c;
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the no of rows");
            r=sc.nextInt();
            System.out.println("enter the no of columns");
            c=sc.nextInt();
            int[][] first=new int[r][c];
            int[][] second=new int[r][c];
            int[][] sum;

            for (int i = 0; i <r ; i++) {
                for (int j = 0; j <c ; j++) {
                    System.out.println("Enter the elements of the first matrix");
                    first[i][j]=sc.nextInt();
                }
            }
            //System.out.println("length of first "+first.length);
            //System.out.println("length of first "+first[1].length);

            for (int i = 0; i <r ; i++) {
                for (int j = 0; j <c ; j++) {
                    System.out.println("Enter the elements of the second matrix");
                    second[i][j]=sc.nextInt();
                }
            }


            sum=add(first,second);
            System.out.println("The result of addition matrix is..");
            for (int i = 0; i <r ; i++) {
                for (int j = 0; j <c ; j++) {
                    System.out.print(sum[i][j]+"\t");
                }
                System.out.println();
            }

            sum=subtract(first,second);
            System.out.println("The result of subtraction matrix is..");
            for (int i = 0; i <r ; i++) {
                for (int j = 0; j <c ; j++) {
                    System.out.print(sum[i][j]+"\t");
                }
                System.out.println();
            }
        }

    public static int[][] add(int[][] first,int[][] second) {
        int[][] sum=new int[r][c];
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                sum[i][j]=first[i][j]+second[i][j];
            }
        }
        return sum;
    }

    public static int[][] subtract(int[][] first,int[][] second) {
        int[][] sum=new int[r][c];
        for (int i = 0; i <r ; i++) {
            for (int j = 0; j <c ; j++) {
                sum[i][j]=first[i][j]-second[i][j];
            }
        }
        return sum;
    }




}
