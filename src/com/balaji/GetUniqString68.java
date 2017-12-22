package com.balaji;

/**
 * Created by gokul on 5/10/17.
 */
public class GetUniqString68 {
    public static void main(String[] args) {
        String s="HellO How Are U";
        System.out.println(getAsUnique(s));

    }
    public static String getAsUnique(String  s){
        //First method removing repeated elements  from last

        /*String result="";
        outer: for (int i = 0; i <s.length(); i++) {
            inner: for (int j = i+1; j <s.length()-1 ; j++) {
                if(s.charAt(i)==s.charAt(j))
                    continue outer;
            }
            result=result+s.charAt(i);

        }
        return result;*/

        // Second method removing repeated elements from first case sensitive

        /*char[] a=s.toCharArray();
        char[] temp=new char[a.length];
        temp[0]=a[0];
        int z=1, count=1;
        outer:for (int i = 1; i <a.length ; i++) {
            inner:for (int j = 0; j <i; j++) {
                if (a[i] == temp[j])
                    continue outer;
            }
            temp[z++]=a[i];
            count++;
        }
        String result="";
        for (int i=0;i<count;i++) {
            result=result+temp[i];
        }
        return result;*/

        //Third method removing th:src="@{ space and non-case sensitive

        char[] a=s.toCharArray();
        char[] temp=new char[a.length];
        temp[0]=a[0];
        int z=1, count=1;
        outer:for (int i = 1; i <a.length ; i++) {
            inner:for (int j = 0; j <i; j++) {
                if (Character.toLowerCase(a[i]) == Character.toLowerCase(temp[j]))
                    continue outer;
            }
            temp[z++]=a[i];
            count++;
        }
        String result="";
        for (int i=0;i<count;i++) {
            result=result+temp[i];
        }
        result=result.replace(" ","");
        return result;
    }
}
