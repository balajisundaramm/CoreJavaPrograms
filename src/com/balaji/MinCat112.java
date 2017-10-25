package com.balaji;



public class MinCat112 {
    public static void main(String[] args) {
        String a="Hello";
        String b="Hiklhi";
        System.out.println(minCat(a,b));
    }
    public static String minCat(String a, String b){
        if(a.length()>b.length()) {
            System.out.println((a.substring((a.length() - b.length()), a.length()) + b));
            return (a.substring((a.length() - b.length()), a.length()) + b);

        }
        else {
            System.out.println((a+b.substring((b.length() - a.length()), b.length())));
            return (a+b.substring((b.length() - a.length()), b.length()));

        }
    }
}
