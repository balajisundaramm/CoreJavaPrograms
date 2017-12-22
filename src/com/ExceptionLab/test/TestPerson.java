package com.ExceptionLab.test;
import com.ExceptionLab.UttaraEx.*;

/**
 * Created by Balaji on 26/10/17.
 */
public class TestPerson {
    public static void main(String[] args) {
        System.out.println("Main starting...");
        try {
            Person person = new Person("Balaji Meenachi sundaram", 51);
            person.dance("Daddy Mummy");
        }
        catch (Throwable e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("main ending...");
    }
}
