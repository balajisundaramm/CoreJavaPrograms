package com.inheritance;

/**
 * Created by Balaji on 14/10/17.
 */
public class Device {
    public Device() {
        System.out.println("In device const with no arg para");
    }

    public Device(String n) {
        this.name = n;
        System.out.println("In Device constru with para String");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    public void doSomething(){
        System.out.println("I am a device with "+name+" & doing something");
    }
}
class Television extends Device{
    public Television() {
        System.out.println("In Tele const with no arg para");
    }

    public Television(String name) {
        super(name);
        System.out.println("Tele const");
    }

    public void doSomething(){
        System.out.println("I am a TV with name "+getName()+" I am useful to watch anything broadcast.");
    }
    public void switchChannel(){
        System.out.println("Channel is changing...");
    }
}
class Printer extends Device{
    public Printer() {
        System.out.println("In Printer const with no arg para");
    }

    public Printer(String name) {
        super(name);
        System.out.println("Printer const");

    }

    public void doSomething(){
        System.out.println("I am a Printer with name "+getName()+" I am useful to print anything.");
    }

}
class MicroWave extends Device{
    public MicroWave() {
        System.out.println("In Micro const with no arg para");
    }

    public MicroWave(String name) {
        super(name);
        System.out.println("Microwave const");
    }

    public void doSomething(){
        System.out.println("I am a Printer with name "+getName()+" I am useful to cook anything.");
    }
}

class Electrician {
    public void treat(Device d) {
        d.doSomething();
        if(d instanceof Television){
            Television television=(Television) d;
            television.switchChannel();
        }
    }
}
/*
class TestDevice{
    public static void main(String[] args) {
        Device d1=new Device();
        d1.name="Sony";
        Device d2=new Device();
        d2.name="Preethi";
        Device d3=new Device();
        d3.name="HP";
        d1.doSomething();
        d2.doSomething();
        d3.doSomething();
        Television t=new Television();
        t.doSomething();
        Printer p=new Printer();
        p.doSomething();
        MicroWave m=new MicroWave();
        m.doSomething();
    }
}
*/

class TestElectrician{
    public static void main(String[] args) {
        Electrician e = new Electrician();
        Device d1=new Television();
       /* Device d = new Television();
        d.doSomething();
        d=new Printer();
        d.doSomething();
        d=new MicroWave();
        d.doSomething();
        System.out.println("d instance of microwave"+(d instanceof MicroWave));
        System.out.println("d instance of printer"+(d instanceof Printer));
        System.out.println("d instance of Television"+(d instanceof Television));
        System.out.println("d instance of device"+(d instanceof Device));*/
        /*Television tv=(Television)d1;
        tv.doSomething();
        tv.switchChannel();*/

        d1.setName("Sony");
        Device d2 = new Printer();
        d2.setName("HP");
        Device d3 = new MicroWave();
        d3.setName("Chef Dhamu");
        e.treat(d1);
        e.treat(d2);
        e.treat(d3);
    }
}