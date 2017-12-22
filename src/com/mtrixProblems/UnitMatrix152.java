package com.mtrixProblems;

/**
 * Created by Balaji on 6/11/17.
 */
public class UnitMatrix152 {
    public static void main(String[] args) {
        int[][] a={{1,1,1},{1,1,1},{1,1,2}};
        System.out.println(isUnitmatrix(a));
    }

    public static boolean isUnitmatrix(int[][] a) {
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[0].length ; j++) {
                if (a[i][j]!=1)
                    return false;
            }
        }
        return true;
    }

    // method2
    public static boolean method2(int[][] a){
        for(int t:a[0])
        {
            if(t!=1)
                return false;
        }
        for(int i:a[1])
        {
            if(i!=1)
                return false;
        }
        return true;
    }
}
