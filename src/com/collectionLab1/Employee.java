package com.collectionLab1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Balaji on 2/11/17.
 */
public class Employee {
    String name;
    Date dob;
    String email;
    Address homeAdd;
    Address offAdd;

    public Employee(String name, Date dob, String email,
                    Address homeAdd, Address offAdd) {
        this.name = name;
        this.dob = dob;
        this.email = email;
        this.homeAdd = homeAdd;
        this.offAdd = offAdd;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("In Person class Equals method");
        if (o instanceof Employee){
            Employee p=(Employee)o;
            if ((this.name.equals(p.name)) && (this.homeAdd.equals(p.homeAdd))
                    && (this.email.equals(p.email)) && (this.offAdd.equals(offAdd))
                    && (this.dob.equals(dob)))
                return true;
            else
                return false;
        }
        else
            return false;
    }
}
class Address{
    String city;
    String street;
    String pin;

    public Address(String city, String street, String pin) {
        this.city = city;
        this.street = street;
        this.pin = pin;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("In address class equals method");
        if (o instanceof Address){
            Address a=(Address)o;

            if ((this.city.equals(a.city) && (this.street.equals(a.street))
                    && (this.pin.equals(a.pin))))
                return true;
            else
                return false;
        }
        else
            return false;

    }
}
class Testing {
    public static void main(String[] args) {
        String d="12/12/2015";
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");

        Date dob=null;
        try {
            dob = sdf.parse(d);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
            Address homeAdd = new Address("tvmalai", "kadalai", "606908");
        Address offAdd = new Address("Bangalore", "Jayanagar", "606988");
        Employee e1=new Employee("Ramu",new Date(),"sfdjy",homeAdd,offAdd);
        Employee e2=new Employee("Ramu",new Date(),"sfdjy",homeAdd,offAdd);
        Employee em1=new Employee("Somu",dob,"fds",homeAdd,offAdd);
        Employee em2=new Employee("Somu",dob,"fds",homeAdd,offAdd);

        System.out.println("e1==e2-->"+(e1.equals(e2)));
        System.out.println("em1==em2-->"+(em1.equals(em2)));


    }
}