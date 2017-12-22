package com.ExceptionLab.UttaraEx;

/**
 * Created by Balaji on 26/10/17.
 */
public class Person {
    private int age;
    private String name;
    public void dance(String song) throws DanceFailureException{
        if (age<50)
            throw new DanceFailureException("Your age is "+getAge()+" which is less than 50. Yoou can't do Salsa dance");
        else
            System.out.println("I am "+getName()+" My age is "+getAge()+" I am dancing Salsa for the song "+song);
    }


    public Person(String name, int age) {
        if (name==null)
            throw new IllegalArgumentException("Name should not be null..");
        name=name.trim();
        if (name.equals(""))
            throw new IllegalArgumentException("Name should not be empty");
        if (name.length()<3 || name.length()>30)
            throw new IllegalArgumentException("Name should contain minimum 3 char & max 30 char");
        else
            this.name = name;
        if (age<=0 || age>110)
            throw new IllegalArgumentException("Age neither should be negative or 0 nor above 110");
        else
            this.age = age;
    }

    public int getAge() {
        return age;
    }

    /*public void setAge(int age) {
        if (age<=0 || age>110)
            throw new IllegalArgumentException("Age neither should be negative or 0 nor above 110");
        else
            this.age = age;
    }*/

    public String getName() {
        return name;
    }

    /*public void setName(String name) {
        if (name==null)
            throw new IllegalArgumentException("Name should not be null..");
        name=name.trim();
        if (name.equals(""))
            throw new IllegalArgumentException("Name should not be empty");
        if (name.length()<3 || name.length()>30)
            throw new IllegalArgumentException("Name should contain minimum 3 char & max 30 char");
        else
            this.name = name;
    }*/
}
