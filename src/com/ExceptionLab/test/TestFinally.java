package com.ExceptionLab.test;

import com.ExceptionLab.UttaraEx.*;



public class TestFinally {
    public static void main(String[] args) {
        try {
            Animal a = new Animal();
            a.m1();
        }
        catch (Throwable t){
            t.printStackTrace();
            t.getMessage();
        }
        finally {

        }
        System.out.println("Bye");
    }

}
