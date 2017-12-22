package com.balaji;

import java.util.TreeSet;

/**
 * Created by Balaji on 26/11/17.
 */
public class altPairs {
    /*public static void main(String[] args) {
        String str="kitten";
        String str2="Chocolate";
        String str3="CodingHorror";

        String result=altPair2(str);
        System.out.println("Your method "+str+"-->"+altPair2(str));
        System.out.println("Your method "+str2+"-->"+altPair2(str2));
        System.out.println("Your method "+str3+"-->"+altPair2(str3));
        TreeSet<Dog> t=new TreeSet<Dog>();
        t.add(new Dog());
        t.add(new Dog());
        System.out.println(altPairs3(str));
    }*/

    public String altPair(String str) {
        char[] b= new char[str.length()];
        int[] a={0,1,4,5,8,9,12,13,16,17};
        int j=0;
        for (int i = 0; i <str.length() ; i++) {
            if (i==a[j]){
                b[j]=str.charAt(i);
                j++;
            }
        }
        return new String(b);
    }

    public static String altPair2(String str) {
        char[] b= new char[str.length()];
        int[] a={0,1,4,5,8,9,12,13,16,17};
        int j=0;
        for (int i = 0; i <str.length() ; i++) {
            if (i==a[j]){
                b[j]=str.charAt(i);
                j++;
            }
        }
        return new String(b);
    }

    public static String altPairs3(String str) {
        String result="";
        int pos=0;
        for (int i=0;i<str.length();i+=4) {
            pos=(i!=str.length()-1)?(i+2):str.length();
            result=result+str.substring(i,pos);
        }
        return result;
    }
}

class Emu {
    static String s = "-";
    public static void main(String[] args) {
        TreeSet<String> s = new TreeSet<String>();
        TreeSet<String> subs = new TreeSet<String>();
        s.add("a"); s.add("b"); s.add("c"); s.add("d"); s.add("e");
        subs = (TreeSet)s.subSet("b", true, "d", true);
        s.add("g");
        s.pollFirst();
        s.pollFirst();
        s.add("c2");
        System.out.println(s.size() +" "+ subs.size());
        System.out.println(s);
        System.out.println(subs);
        /*Which are true? (Choose th:src="@{ that apply.)
        A. The size of s is 4
        B. The size of s is 5
        C. The size of s is 7
        D. The size of subs is 1
        E. The size of subs is 2
        F. The size of subs is 3
        G. The size of subs is 4
        H. An exception is thrown at runtime"*/
    }
}
