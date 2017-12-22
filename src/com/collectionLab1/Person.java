package com.collectionLab1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Balaji on 2/11/17.
 */
public class Person {
    String name;
    int height;

    @Override
    public boolean equals(Object o) {
        System.out.println("In person equals");
        if (o instanceof Person) {
            Person person = (Person) o;
            if (this.name.equals(person.name) && (this.height == person.height))
                return true;
            else
                return false;
        }
        else
            return false;

    }

    @Override
    public String toString() {
        return ("Person:"+name+","+height);
    }

    public Person(String name, int height) {
        this.name = name;
        this.height = height;

    }

    /*public static void main(String[] args) {
        String s1=new String("Ramu");
        String s2=new String("Ramu");
        System.out.println("s1==s2-->"+s1==s2);
        System.out.println("s1.equals(s2)-->"+s1.equals(s2));
    }*/
}
class TestPerson{
    public static void main(String[] args) {
        Person person1=new Person("Ramu",34);
        Person person2=new Person("Somu",44);
        Person person3=new Person("Raja",44);
        Person person4=new Person("Ramu",34);
        //System.out.println("p1==p2--> "+(person1==person2));
        //System.out.println("p1.equals(p2)--> "+(person1.equals(person2)));

        //System.out.println("P1 -->"+person1);
        //System.out.println("P2 -->"+person2);
        List list=new ArrayList();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        System.out.println("contain-->"+list.contains(person4));
        System.out.println("remove-->"+list.remove(person4));
        System.out.println("contain-->"+list.contains(person4));

    }
}
