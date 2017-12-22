package com.interiewQuestions;

/**
 * Created by Balaji on 9/11/17.
 */
public class Sun5 {
    private int sunNo;

    private Sun5(int sunNo) {
        this.sunNo = sunNo;
    }

    public static Sun5 ref=null;
    static int count=0;
    public static Sun5 getInstance(){
        count++;
        if (count%5==1)
            ref=new Sun5(1);
        if (count%5==2)
            ref=new Sun5(2);
        if (count%5==3)
            ref=new Sun5(3);
        if (count%5==4)
            ref=new Sun5(4);
        if (count%5==0)
            ref=new Sun5(5);

        return ref;
    }

    @Override
    public String toString() {
        return "Sun5:"+sunNo;
    }
}
class TestSun{
    public static void main(String[] args) {
        Sun5 s1=Sun5.getInstance();
        System.out.println(s1);
        Sun5 s2=Sun5.getInstance();
        System.out.println(s2);
        Sun5 s3=Sun5.getInstance();
        System.out.println(s3);
        Sun5 s4=Sun5.getInstance();
        System.out.println(s4);
        Sun5 s5=Sun5.getInstance();
        System.out.println(s5);
        Sun5 s6=Sun5.getInstance();
        System.out.println(s6);
        Sun5 s7=Sun5.getInstance();
        System.out.println(s7);
        Sun5 s8=Sun5.getInstance();
        System.out.println(s8);
        Sun5 s9=Sun5.getInstance();
        System.out.println(s9);
        Sun5 s10=Sun5.getInstance();
        System.out.println(s10);
        Sun5 s11=Sun5.getInstance();
        System.out.println(s11);

    }
}
