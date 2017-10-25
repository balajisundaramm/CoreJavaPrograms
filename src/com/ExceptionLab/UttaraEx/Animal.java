package com.ExceptionLab.UttaraEx;

import com.balaji.A;

/**
 * Created by Balaji on 25/10/17.
 */
public class Animal {
    public int m1(){
        int x=10;
        try{
            System.out.println("In try of m1() x -->"+x);
            String s=null;
            s.length();

            return ++x;

        }
        catch (Exception t){
            String s=null;
            System.out.println("In catch x-->"+x);
            s.length();
            return ++x;
        }
        finally {
            System.out.println("In finally x-->"+x);
            //return ++x;
        }
    }
}
class Pig extends Animal{

}
/*
class TestEx {
    public static void main(String[] args) {
        try {
            System.out.println("In main..");
            m1();
            System.out.println("Main Ending....");
        }
        catch (Throwable t){
            t.printStackTrace();
        }
        System.out.println("Main Ending...");
    }
    public static void m1(){
        System.out.println("in m1()");
        m2();
    }
    public static void m2(){
        System.out.println("In m2()");
        Animal a=new Animal();
        m3(a);
        Pig p=new Pig();
        m3(p);
    }
    public static void m3(Animal a){
        System.out.println("In m3()");

        if (a instanceof Pig) {
            Pig p = (Pig) a;
        }
        else{
            System.out.println("You can only pass an animal which is pig or sub type of pig..");
        }

    }
}*/



