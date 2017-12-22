package com.OnlineCoding;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by Balaji on 19/12/17.
 */
public class ProgrammingTest2 implements Comparator<Integer>{
    public static void main(String[] args) {
        int[] a={9,32,99,45,33,48,3,4};
        arrange(a);
    }

    public static int[] arrange(int[] a) {
        String[] result=new String[a.length];
        String[] temp=new String[a.length];
        String [] single=new String[a.length];
        int index=0;
        for (int i = 0; i <a.length ; i++) {
            temp[index++]=String.valueOf(a[i]);
        }
        List<String> list=new ArrayList();
        for (String s:temp) {
            list.add(s);
        }


       /*ArrayList list=new ArrayList();
        list.add(97);
        list.add(9);
        list.add(10);
        list.add(1);*/
        System.out.println("Before "+list);
        //Collections.sort(list,new ProgrammingTest2());
        /*int in=a.length;
        for (String s:list) {
          */  //result[--in]=s;
      //  }
        /*for (Object s:list) {
            System.out.println(s);
        }*/
for(int i=list.size()-1;i>=0;i--)
{
    System.out.println(list.get(i));
}





        System.out.println("List "+list);
        return null;

    }

    @Override
    public int compare(Integer o1,Integer o2) {

            String s1=Integer.toString(o1)+Integer.toString(o2);
            String s2=Integer.toString(o2)+Integer.toString(o1);
            return s1.compareTo(s2);
        }

    }

