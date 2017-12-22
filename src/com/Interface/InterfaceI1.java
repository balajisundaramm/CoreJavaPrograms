package com.Interface;

/**
 * Created by Balaji on 27/10/17.
 */
public interface InterfaceI1 {

}
interface Thing{
    public void doSomething();
}
class Tool implements Thing{

    @Override
    public void doSomething() {
        System.out.println("Thing doing something");
    }
}
class Spanner extends Tool{
    public void doSomething(){
        System.out.println("Spanner loosening nuts");
    }
}
class TubeLight implements Thing{

    @Override
    public void doSomething() {
        System.out.println("Renders light");
    }
}
class Vehicle implements Thing{
    String name;

    @Override
    public void doSomething() {
        System.out.println("I am "+name+",  is used for driving");
    }
}
class Person{
    public void testthings(Thing thing){
        thing.doSomething();
    }
}

