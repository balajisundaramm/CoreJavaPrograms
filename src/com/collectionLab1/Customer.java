package com.collectionLab1;

import java.util.HashSet;

/**
 * Created by Balaji on 11/11/17.
 */
public class Customer {
    String name;
    String aNo;
    String aType;
    public Customer(String name, String aNo, String aType) {
        this.name = name;
        this.aNo = aNo;
        this.aType = aType;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getaNo() {
        return aNo;
    }
    public void setaNo(String aNo) {
        this.aNo = aNo;
    }
    public String getaType() {
        return aType;
    }
    public void setaType(String aType) {
        this.aType = aType;
    }
    @Override
    public int hashCode() {
        return aNo.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Customer)
        {
            Customer v=(Customer)obj;

            if(this.aNo.equals(v.aNo))
            {
                return true;
            }
            else
                return false;
        }
        else
            throw new IllegalArgumentException("plz pass only student object to compare");
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", aNo=" + aNo + ", aType=" + aType + "]";
    }

    public int compareTo(Object o) {
        if(o instanceof Customer) {
            System.out.println("this.ano"+this.aNo);
            Customer c=(Customer)o;
            System.out.println("c.ano"+c.aNo);
            return this.aNo.compareTo(c.aNo);
        }
        else
            throw new IllegalArgumentException("Pass customer");
    }

}
class TestCustomer{
    public static void main(String[] args) {
        Customer customer=new Customer("Balaji","123","saving");
        Customer customer2=new Customer("Balajill","123","saving");
        HashSet l=new HashSet();
        l.add(customer);
        System.out.println(l.add(customer2));
    }
}