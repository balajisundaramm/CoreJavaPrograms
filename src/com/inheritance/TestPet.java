package com.inheritance;

/**
 * Created by Balaji on 27/10/17.
 */
public class TestPet {
    public static void main(String[] args) {
        B obj=new B();
        System.out.println("by using b ref-->"+obj.name);
        A a=new B();
        System.out.println("by using a ref-->"+a.name);
        obj.print();
        a.print();
    }
}
