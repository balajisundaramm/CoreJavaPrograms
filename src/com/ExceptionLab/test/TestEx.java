
package com.ExceptionLab.test;

import com.ExceptionLab.UttaraEx.*;

public class TestEx {
    public static void main(String[] args) throws OwnException {
        System.out.println("Hi");
        /*if (true)
            throw new OwnException();*/
        System.out.println("Bye");
        m1();
    }

    public static void m1() throws OwnException {
        throw new OwnException();
    }
}
class OwnException extends Exception{

}