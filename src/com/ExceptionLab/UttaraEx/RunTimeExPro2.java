package com.ExceptionLab.UttaraEx;

import com.balaji.Person;

/**
 * Created by Balaji on 25/10/17.
 */
public class RunTimeExPro2 {
    public static void main(String[] args) {
        try{
            String[] strings =new String[3];
            strings[0]="abc";
            // ArrayIndexEx
            //System.out.println(args[3]);
            // StringIndexEx
            //System.out.println(strings[0].charAt(4));
            // NullPointer Ex
            //System.out.println(strings[1].length());
            //ClassCastEx
            Person p=new Saran();
            //Saran s=new Saran();
            //Gokul g= (Gokul) p;
            // StackOutOfMemEx
            //m1();
            //OutOfMemEx
            String [] s=new String[9999999];
            for (int i = 0; i < 299999999; i++) {
                String a=new String("Abc");
                s[i]=a;
            }

        }
        catch (Throwable e){
            e.printStackTrace();
        }
        System.out.println("Main Ended...");
    }
    public static void m1(){
        m1();
    }
}
class person{
    String name;
    public void dance(){

    }
}
class Gokul extends Person{

}
class Saran extends Person{

}
