package com.Interface;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by Balaji on 27/10/17.
 */
public class Duck {
    public final int SIZE;
    public static int noOfDuck;

    public void swim(){
        if(SIZE==5) {
            System.out.println("Duck is swimming dead slowly");
        }

        if (SIZE==10) {
            System.out.println("Duck is swimming quite slowly");
        }
        if (SIZE==15) {
            System.out.println("Duck is swimming fast");
        }
    }

    public Duck(int SIZE) {
        this.SIZE = SIZE;
        System.out.println(++noOfDuck);
    }
}
class TestDuck{
    public static void main(String[] args) {
        Duck duck1=new Duck(5);
        duck1.swim();
        Duck duck2=new Duck(10);
        duck2.swim();
        Duck duck3=new Duck(15);
        duck3.swim();
        duck3.swim();
    }
}

