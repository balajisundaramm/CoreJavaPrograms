package com.inheritance;

/**
 * Created by Balaji on 21/10/17.
 */
public class TestInitializer {
    int a=10;
    static int b=15;
    {
        System.out.println("Instance initializer 1--> a "+a);
        a=20;
    }
    {
        System.out.println("Instance Ini 2 a-->"+a);
        a=30;
    }
    static {
        System.out.println("in static initia 1 b-->"+b);
        b=25;
    }
    static{
        System.out.println("in static init 2 b---> "+b);
        b=35;
    }

    public TestInitializer() {
        System.out.println("In Constru a-->"+a);
        System.out.println("in cons b-->"+b);
        a=40;
        b=45;
    }

    public TestInitializer(int x) {
        System.out.println("in para cons of test ini x-->"+x);
        a=x;
    }

    public static void main(String[] args) {
        System.out.println("in main b-->"+b);
        TestInitializer obj=new TestInitializer();
        System.out.println("In main a-->"+obj.a);
        System.out.println("in main b-->"+b);
        TestInitializer obj2=new TestInitializer();


    }
}
