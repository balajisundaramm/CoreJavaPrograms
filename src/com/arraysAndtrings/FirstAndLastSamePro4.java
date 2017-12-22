package com.arraysAndtrings;

/**
 * Created by Balaji on 29/11/17.
 */
public class FirstAndLastSamePro4 {
    public static void main(String[] args) {
        int[] a={5,6,66,13,66,5,6};
        int num=2;
            System.out.println(firstLast(a,num));
    }

    public static boolean firstLast(int[] a1,int num){
        int temp=0;
        boolean flag=false;
        while (temp<num){
            if (a1[temp]==a1[a1.length+temp-num])
                flag=true;
            temp++;
        }
        return (num==0)?true:flag;
    }
}
