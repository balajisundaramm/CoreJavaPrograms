package com.inheritance;

/**
 * Created by Balaji on 24/10/17.
 */
public class TestConstructor extends A{
     TestConstructor() {
        System.out.println("c cons");
    }

    public static void main(String[] args) {
        A a1=new A();
        A a2=new B();
        A a3=new TestConstructor();

    }
}
class A{
     A() {
        System.out.println("A cons");
    }
}
class B extends A{
     B() {
        System.out.println("B cons");
    }
}
