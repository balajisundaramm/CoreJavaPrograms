package com.balaji;

/**
 * Created by Balaji on 10/10/17.
 */
public class WithOutUpperCase {
    public static void main(String[] args) {
        String[] arr={"one","Two","yhrEe","vvv"};
        for (String z:withOutUppercase(arr)) {
            System.out.println(z);
        }
    }
    public static String[] withOutUppercase(String[] arr){
        String[] temp=new String[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length();j++) {
                if (arr[i].charAt(j)>64 && arr[i].charAt(j)<91) {
                    break;
                }

            }
            temp[i] = arr[i];
            count++;

        }
        String[] result=new String[count];
        int z=0;
        for (String x:temp) {
            result[z++]=x;
        }
        return result;
    }
}
