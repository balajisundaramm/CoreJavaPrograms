package com.Interface;

/**
 * Created by Balaji on 27/10/17.
 */
public abstract class Animal {
    String name;

    public Animal() {
        System.out.println("in animal no arg cons");
    }

    public Animal(String name) {
        this.name = name;
        System.out.println("in animal para cons");
    }

    public void sleep(){
        System.out.println("animal is sleeping..");
    }
    public abstract void eat();
}
class Croc extends Animal{
    public Croc() {
        System.out.println("in croc no arg cons");
    }

    public Croc(String name) {
        super(name);
        System.out.println("in croc para cons");
    }

    public void swim(){
        System.out.println("Croc swimming...");
    }
    public void eat(){
        System.out.println("eat method in croc");
    }
    public void sleep(){
        System.out.println("croc is sleeping..");
    }
}