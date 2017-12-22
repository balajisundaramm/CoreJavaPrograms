package com.mtrixProblems;

/**
 * Created by Balaji on 6/11/17.
 */
public class Addition2By2 {
    public static void main(String[] args) {
        int[][]a={{1,2},{3,4}};
        int[][]b={{1,2},{3,4}};
        int[][] result=add(a,b);
        for (int i=0;i<result.length;i++) {
            for (int j = 0; j <result.length ; j++) {
                System.out.print(result[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public static int[][] add(int[][] a, int[][] b) {
        int[][] c=new int[a.length][b.length];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a.length ; j++) {
                //int var=a[i][j]+b[i][j];
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        return c;
    }
}
