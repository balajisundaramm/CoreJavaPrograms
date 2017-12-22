package com.mtrixProblems;

/**
 * Created by Balaji on 6/11/17.
 */
public class IdentityMatrix154 {
    public static void main(String[] args) {
        int[][] a={{1,0},{0,1}};
        System.out.println(method2(a));
    }

    public static boolean isIdentityMatrix(int[][] a) {
        boolean flag=false;
        for (int i=0;i<a.length;i++) {
            for (int j = 0; j <a[0].length ; j++) {
                flag=(i==j)?(a[i][j]==1)?true:false:(a[i][j]==0)?true:false;
                if (flag==false)
                    return flag;
                            }
        }
        return flag;
    }

    public static boolean method2(int[][] a){
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[0].length ; j++) {
                if(i==j && a[i][j]!=1)
                    return false;
                else {
                    if ((i != j) && a[i][j] != 0)
                        return false;
                }
            }

        }
        return true;
    }
}
