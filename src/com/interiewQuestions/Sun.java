package com.interiewQuestions;

/**
 * Created by Balaji on 9/11/17.
 */
public class Sun {
    private Sun() {

    }
    public static Sun ref=null;
    public static Sun getinstance(){
        if (ref==null)
            ref=new Sun();
        return ref;
    }
}
class Singleton{
    public static void main(String[] args) {
        Sun s1=Sun.getinstance();
        System.out.println(s1);


    }
}
