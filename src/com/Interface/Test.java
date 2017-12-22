package com.Interface;

/**
 * Created by Balaji on 27/10/17.
 */
/*
public class Test implements I2,I1 {

}
*/
interface I1{
    public void m1();
}
interface I2{
    public int m1();
    public void m2();
   // public void m1();

}
/*
interface I3 extends I1,I2{

}
*/
abstract class A1 implements I2{
    public int m1(){
        System.out.println("In A1 ,m1()");
        return 5;
    }
}
class C2 extends A1{
 public void m2(){
     System.out.println("c2--> m2()");
 }
}
class Tester{
    public static void main(String[] args) {
        /*Thing thing=new Spanner();
        System.out.println("Thing ref--> spanner");
        thing.doSomething();
        Tool tool=new Spanner();
        System.out.println("Tool ref--> spanner");
        tool.doSomething();*/
        Spanner spanner=new Spanner();
        //spanner.doSomething();
        Vehicle vehicle=new Vehicle();
        vehicle.name="Yamaha";
        TubeLight tubeLight=new TubeLight();
        Person person=new Person();
        System.out.println("person is gien spanner");
        person.testthings(spanner);
        System.out.println("person is gien vehicle");
        person.testthings(vehicle);
        System.out.println("person is gien tubelight");
        person.testthings(tubeLight);

    }
}
