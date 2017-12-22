package com.balaji;

/**
 * Created by Balaji on 2/11/17.
 */
public class LargeSum136 {
    public static void main(String[] args) {
        int[] a = {1,2};
        int[] b={3,4};
        for (int i:biggerTwo(a,b)) {
            System.out.println(i);
        }
    }

    public static int[] biggerTwo(int[] a, int[] b) {
        int sum1 = 0, sum2 = 0;
        for (int i : a) {
            sum1 = sum1 + i;
        }
        for (int i : b) {
            sum2 = sum2 + i;
        }
        return (sum1 < sum2) ? b : a;

    }
}


