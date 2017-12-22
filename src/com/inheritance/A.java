package com.inheritance;

/**
 * Created by Balaji on 27/10/17.
 */
public class A {
    String name="A";

    public A() {
        System.out.println("In a no arg cons");
    }

    public A(String name) {
        this.name = name;
        System.out.println("In A paraconstru");
    }
    public void print(){
        System.out.println("In A method-->"+name);
    }
}
class B extends A{
     String name="B";

    public B() {
        System.out.println("in B no arg const ");
    }
    public void print(){
        System.out.println("in b method name-->"+name);
    }

}
