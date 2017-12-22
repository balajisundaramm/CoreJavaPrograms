package com.balaji;

/**
 * Created by Balaji on 3/11/17.
 */
public class Testtttt {

}
class SuperA
{
    String s1 = "SuperA";
}

class SuperB
{
    String s1 = "SuperB";
}

class AA extends SuperA
{

    String s1 = "A";

    class B extends SuperB
    { // 1

        String s1 = "B";

        void m1()
        {

            System.out.print(this.s1 + ","); // 2

            System.out.print(super.s1 + ","); // 3

            System.out.print(AA.this.s1 + ","); // 4

            System.out.print(AA.super.s1); // 5

        }

    }

    public static void main(String[] args)
    {

        new AA().new B().m1(); // 6

    }
}


