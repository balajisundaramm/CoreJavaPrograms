package com.arraysAndtrings;

/**
 * Created by Balaji on 29/11/17.
 */
public class MatchUpPro3 {
    private String string;
    public static void main(String[] args) {
       /* int[] a1={3,10,3};
        int[] a2={1,2,5};
        System.out.println(matchUp(a1,a2));
        System.out.println(1<<1);*/
       int[] a=new int[] {1,2,3};
        for (int i:a) {
            System.out.println(i);
        }
    }

    public static int matchUp(int[] a1, int[] a2) {
        int diff=0;
        for (int i = 0; i <a1.length ; i++) {
            int tmp=0;
            if((tmp=(int)Math.abs(a1[i]-a2[i]))<3){
               diff=diff+tmp;
            }
        }
        return diff;
    }
}
