package com.balaji;

/**
 * Created by Balaji on 2/11/17.
 */
public class ConsecutiveString134 {
    public static void main(String[] args) {
        String str="This iiiiis aaaaaaaaaaaaaaaaaa strrrrrrrrrrrrring";
        System.out.println(maximumConsecutivechar(str));
    }
    public static String maximumConsecutivechar(String str){
        String[] strings=str.split(" ");
        String result="";
        int max=0, count=0;
        int index=0;
        for (int j=0;j<strings.length;j++) {
            String temp=strings[j];
            count=0;
            for (int i = 0; i <temp.length()-1 ; i++) {
                if (temp.charAt(i) == temp.charAt(i+1))
                    count++;
                //max=(max<count)?count:max;
                if (max<count){
                    max=count;
                    index=j;
                }
            }
            result=strings[index];
        }
        return result;
    }
}
