package com.inheritance;

/**
 * Created by Balaji on 21/10/17.
 */
public class Y extends TestInitializer {
    int c=10;
    static int d=15;
    {
        System.out.println("Instance initializer 1--> c "+c);
        c=20;
    }
    {
        System.out.println("Instance Ini 2 c-->"+c);
        c=30;
    }
    static {
        System.out.println("in static initia 1 d-->"+d);
        d=25;
    }
    static{
        System.out.println("in static init 2 d---> "+d);
        d=35;
    }

    public Y() {
        System.out.println("In Constru c-->"+c);
        System.out.println("in cons d-->"+d);
        c=40;
        d=45;
    }

    public Y(int y) {
        System.out.println("in constru of Y y-->"+y);
        c=y;
    }

    public static void main(String[] args) {
       /* System.out.println("in main d-->"+d);
        Y obj2=new Y();
        System.out.println("In main c-->"+obj2.c);
        System.out.println("in main d-->"+d);
        Y obj3=new Y();*/
       Y obj4=new Y(44);
    }

}
