package com.collectionLab2;

import com.balaji.Lab;

import java.util.*;

/**
 * Created by Balaji on 6/11/17.
 */
public class Vehicle implements Comparable {
    private String name;
    private int capcity;

    public Vehicle(String name, int capcity) {
        this.name = name;
        this.capcity = capcity;
    }

    public String getName() {
        return name;
    }

    public int getCapcity() {
        return capcity;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("In equals");
        if (o instanceof Vehicle){
            Vehicle v=(Vehicle)o;
            if (this.getCapcity()==v.capcity && this.getName().equals(v.getName()))
                return true;
            return false;
        }
        else
            throw new IllegalArgumentException("Vehicles are only ");
    }



    @Override
    public int hashCode() {
        System.out.println("In hashcode");
        return (getName()+getCapcity()).hashCode();
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Vehicle){
            Vehicle v=(Vehicle)o;
            return this.getCapcity()-v.getCapcity();
        }
        else
            throw new IllegalArgumentException(".....");
    }
}

class TestVehicle {
    /*public static void main(String[] args) {
        *//*Vehicle vehicle1=new Vehicle("Yamaha",120);
        Vehicle vehicle2=new Vehicle("Yamaha",120);
        Vehicle vehicle3=new Vehicle("Pulser",150);
        System.out.println("v1==v2 "+vehicle1.equals(vehicle2));

        List list=new ArrayList();
        list.add(vehicle1);
        System.out.println("contains "+list.contains(vehicle2));

        Set set=new HashSet();
        set.add(vehicle1);
        System.out.println(set.add(vehicle2));*//*

        *//*
       // List list= Arrays.asList(new int[]{15, 7, 8});
        List list=new ArrayList();
        list.add(5);
        list.add(15);
        list.add(25);
        System.out.println(add(list));*//*

        Set set=new LinkedHashSet();
        set.add("ramappa");
        set.add("rama");
        set.add("mama");
        set.add("goma");
        String s=new String("ram");
        System.out.println(set);
        *//*for (Object o:set) {
            String s1=(String)o;
            if (s1.contains(s))
                set.remove(s);
        }*//*

        Iterator i=set.iterator();
        while(i.hasNext())
        {
            String p=(String)i.next();
            if(p.contains(s))
            {
                i.remove();
            }


        }
        //set.remove(s);
        System.out.println(set);

    }*/

    public static int add(List list){
        int sum=0;
        for (Object o:list) {
            if (o instanceof Integer){
                Integer i=(Integer)o;
                sum=sum+i;
            }
            else
                throw new IllegalArgumentException("Pass Integer");
        }
        return sum;
    }
}


class TestVehPro8{
    public static void main(String[] args) {
        Vehicle v1=new Vehicle("Yamaha",150);
        Vehicle v2=new Vehicle("Pulsor",180);
        Vehicle v3=new Vehicle("Apachy",200);
        Vehicle v4=new Vehicle("TVS",120);
        TreeSet set=new TreeSet();
        set.add(v1);
        set.add(v2);
        set.add(v3);
        set.add(v4);
        System.out.println(set);
    }
}